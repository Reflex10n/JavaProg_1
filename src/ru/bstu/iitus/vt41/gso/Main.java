package ru.bstu.iitus.vt41.gso;

import ru.bstu.iitus.vt41.gso.inventoryContainer.mainEquipmentClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        mainEquipmentClass container = new mainEquipmentClass();
        container.initConstructions(new Scanner(System.in));
        System.out.println(container.InventoryWithMainCharacteristicWeight());
    }
}