package ru.bstu.iitus.vt41.gso.enums;

import ru.bstu.iitus.vt41.gso.exceptions.WrongInputValueException;

public enum KindOfSport {
    BASKETBALL("Basketball", 0),            // Баскетбол
    TENNIS("Tennis", 1),                    // Теннис
    SHOTPUT("Shot put", 2),                 // Метание ядра
    WEIGHTLIFTING("Weightlifting", 3);      // Пауэрлифтинг

    int i;
    String strType;

    KindOfSport(String strType, int i) {
        this.i = i;
        this.strType = strType;
    }

    public static KindOfSport getValue(int num) throws WrongInputValueException {
        for(KindOfSport instance : KindOfSport.values())
        {
            if(instance.i == num)
                return instance;
        }
        throw new WrongInputValueException();
    }

    public static KindOfSport getValue(String name) throws WrongInputValueException {
        for(KindOfSport instance : KindOfSport.values())
        {
            if(instance.strType.equals(name))
                return instance;
        }
        throw new WrongInputValueException();
    }
}
