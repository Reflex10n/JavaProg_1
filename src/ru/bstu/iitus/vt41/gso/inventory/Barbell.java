package ru.bstu.iitus.vt41.gso.inventory;

import java.util.Scanner;

public class Barbell extends Fitness{

    private int vultureWidth;

    public void init(Scanner scanner) {
        super.init(scanner);
        vultureWidth = inputInt(scanner, "Ширина грифа: ");
    }

    protected void ShowInfo(){
        super.ShowInfo();
        System.out.println("\nШирина грифа: " + vultureWidth);
    }
}
