package ru.bstu.iitus.vt41.gso.inventory;

import java.util.Scanner;

public class Bullet extends SportsEquipment {

    private int radius, weight;

    public void init(Scanner scanner) {
        super.init(scanner);
        radius = inputInt(scanner, "Радиус: ");
        weight = inputInt(scanner, "Вес: ");
    }

    protected void ShowInfo(){
        super.ShowInfo();
        System.out.println("\nРадиус: " + radius);
        System.out.println("\nВес: " + weight);
    }
}
