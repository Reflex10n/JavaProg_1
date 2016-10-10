package ru.bstu.iitus.vt41.gso.inventory;

import java.util.Scanner;

public class TennisBall extends Ball{

    private int speedOfRebound;

    public void init(Scanner scanner) {
        super.init(scanner);
        speedOfRebound = inputInt(scanner, "Скорость отскока: ");
    }

    protected void ShowInfo(){
        super.ShowInfo();
        System.out.println("\nСкорость отскока: " + speedOfRebound);
    }
}
