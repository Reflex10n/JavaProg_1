package ru.bstu.iitus.vt41.gso.inventory;

import java.util.Scanner;

public class Racket extends SportsEquipment {

    private int length, width;

    public void init(Scanner scanner) {
        super.init(scanner);
        length = inputInt(scanner, "Длина: ");
        width = inputInt(scanner, "Ширина: ");
    }

    protected void ShowInfo(){
        super.ShowInfo();
        System.out.println("\nДлина: " + length);
        System.out.println("\nШирина: " + width);
    }
}
