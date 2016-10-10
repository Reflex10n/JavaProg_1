package ru.bstu.iitus.vt41.gso.inventory;

import java.util.Scanner;

public abstract class Fitness extends SportsEquipment {

    private int weight;

    public void init(Scanner scanner) {
        super.init(scanner);
        weight = inputInt(scanner, "Вес снаряда: ");
    }

    protected void ShowInfo(){
        super.ShowInfo();
        System.out.println("\nВес снаряда: " + weight);
    }
}
