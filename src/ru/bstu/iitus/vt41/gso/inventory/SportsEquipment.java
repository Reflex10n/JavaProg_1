package ru.bstu.iitus.vt41.gso.inventory;

import ru.bstu.iitus.vt41.gso.enums.KindOfSport;
import ru.bstu.iitus.vt41.gso.exceptions.WrongInputValueException;

import java.util.Scanner;

public abstract class SportsEquipment {

    private int kindOfSport = -1;

    public void init(Scanner scanner) {
        while (kindOfSport == -1) {
            try {
                String buf = inputString(scanner, "Вид спорта, к которому относится: ");
                kindOfSport = KindOfSport.getValue(buf).ordinal();
            } catch (WrongInputValueException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    protected String inputString(Scanner scanner, String message) {
        ShowMessage(message);
        return (scanner.nextLine());
    }

    protected int inputInt(Scanner scanner, String message) {
        int value = 0;

        ShowMessage(message);
        while (value == 0) {
            try {
                value = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Ошибка ввода!" + e.toString());
            }
        }
        return value;
    }

    protected void ShowMessage(String message) {
        System.out.flush();
        System.out.println(message);
    }

    protected void ShowInfo(){
        String buf= "";
        try{
            buf = KindOfSport.getValue(kindOfSport).name();
        }
        catch (WrongInputValueException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Вид спорта: " + buf);
    }

    public int getSportType(){ return kindOfSport; }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
