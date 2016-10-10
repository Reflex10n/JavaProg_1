package ru.bstu.iitus.vt41.gso.inventory;

import java.util.Scanner;

public class Basketball extends Ball{

    private String material;

    public void init(Scanner scanner) {
        super.init(scanner);
        material = inputString(scanner, "Из чего изготовлен: ");
    }

    protected void ShowInfo(){
        super.ShowInfo();
        System.out.println("\nМатериал изготовления: " + material);
    }
}
