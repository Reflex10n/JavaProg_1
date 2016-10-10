package ru.bstu.iitus.vt41.gso.inventory;

import java.util.Scanner;

public abstract class Ball extends SportsEquipment{

    private int radius;

    public void init(Scanner scanner) {
        super.init(scanner);
        radius = inputInt(scanner, "Радиус мяча: ");
    }

    protected void ShowInfo(){
        super.ShowInfo();
        System.out.println("\nРадиус мяча: " + radius);
    }
}
