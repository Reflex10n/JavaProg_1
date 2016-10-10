package ru.bstu.iitus.vt41.gso.inventory;

import java.util.Scanner;

public class Poise extends Fitness{

    private String form;

    public void init(Scanner scanner) {
        super.init(scanner);
        form = inputString(scanner, "Форма гири: ");
    }

    protected void ShowInfo(){
        super.ShowInfo();
        System.out.println("\nФорма гири: " + form);
    }
}
