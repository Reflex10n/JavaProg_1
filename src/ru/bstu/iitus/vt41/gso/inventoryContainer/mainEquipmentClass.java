package ru.bstu.iitus.vt41.gso.inventoryContainer;

import ru.bstu.iitus.vt41.gso.enums.InventoryType;
import ru.bstu.iitus.vt41.gso.exceptions.WrongInputTypeException;
import ru.bstu.iitus.vt41.gso.inventory.SportsEquipment;

import java.util.ArrayList;
import java.util.Scanner;

public class mainEquipmentClass {

    private ArrayList<SportsEquipment> equipmentList;
    private int equipmentCount;

    public void initConstructions(Scanner scanner) {
        equipmentCount = inputInt(scanner, "Введите количество спортивного инвентаря: ");
        equipmentList = new ArrayList<>();
        fillConstructionList(scanner);
    }

    private int inputInt(Scanner scanner, String message) {
        int value = 0;
        showMessage(message);
        while (value == 0) {
            try {
                value = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Ошибка ввода!" + e.toString());
            }
        }
        return value;
    }

    private void showMessage(String message) {
        System.out.println(message);
    }

    private void fillConstructionList(Scanner scanner) {

        for (int i = 0; i < equipmentCount; i++) {
            SportsEquipment instance = null;
            while (instance == null) {
                String type = readType(scanner);
                try {
                    instance = (SportsEquipment)InventoryType.getValue(type).getType().newInstance();
                    instance.init(scanner);
                    equipmentList.add(instance);
                } catch (WrongInputTypeException | InstantiationException | IllegalAccessException e) {
                    System.err.println(e.toString());
                }
            }
        }
    }

    public String InventoryWithMainCharacteristicWeight(){
        String result = "";
        for(SportsEquipment se : equipmentList) {
            if (InventoryType.WeightIsMainCharacteristic(se.getSportType()))
                result += se.toString() + " ";
        }
        if (result != "")
            return "Весь инвентарь с основной характеристикой вес:\n\n" + result;
        else return "Такого инвентаря нет =(";
    }

    private String readType(Scanner scanner) {
        showMessage("Введите тип объекта:" +
                "\nBasketball" +
                "\nTennis ball" +
                "\nRacket" +
                "\nBullet" +
                "\nBarbell" +
                "\nPoise");
        return (scanner.nextLine());
    }
}
