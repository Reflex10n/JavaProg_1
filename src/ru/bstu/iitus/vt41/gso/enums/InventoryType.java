package ru.bstu.iitus.vt41.gso.enums;

import ru.bstu.iitus.vt41.gso.inventory.*;
import ru.bstu.iitus.vt41.gso.exceptions.WrongInputTypeException;

public enum InventoryType {
    BASKETBALL("Basketball", 0, Basketball.class),   // Баскетбольный мяч
    TENNISBALL("Tennis ball", 1, TennisBall.class),  // Теннисный мяч
    RACKET("Racket", 2, Racket.class),               // Ракетка
    BULLET("Bullet", 3, Bullet.class),               // Ядро
    BARBELL("Barbell", 4, Barbell.class),            // Штанга
    POISE("Poise", 5, Poise.class);                  // Гиря

    int i;
    String strType;
    Class<?>  classType;

    InventoryType(String strType, int i, Class type) {
        this.i = i;
        this.strType = strType;
        this.classType = type;
    }

    public static boolean WeightIsMainCharacteristic(int i){
        switch (i){
            case 0:
            case 1:
            case 2: return false;
            default: return true;
        }
    }

    public static InventoryType getValue(int num) throws WrongInputTypeException {
        for(InventoryType instance : InventoryType.values())
        {
            if(instance.i == num)
                return instance;
        }
        throw new WrongInputTypeException();
    }

    public static InventoryType getValue(String name) throws WrongInputTypeException {
        for(InventoryType instance : InventoryType.values())
        {
            if(instance.strType.equals(name))
                return instance;
        }
        throw new WrongInputTypeException();
    }

    public Class getType()
    {
        return classType;
    }
}
