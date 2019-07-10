package home.Aleinikov;
import java.util.Scanner;

public class Main {

    public static int countPackage;
    private static char[] array = new char[32];

    public static void main(String[] args) {
        int counter = 1;
        int maxCountPackage = 100;

        while (true) {
            System.out.println("");
            System.out.println("\u001B[31m" +"Расчёт №" +counter +"\u001B[0m");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter Count potatos: ");
            int countPotatos = scanner.nextInt();

            if (countPotatos <= 0 || countPotatos >= 1000) {
                System.out.println("Error! Please check enter count potato!");
            } else {
                System.out.print("Please enter Size of the Package: ");
                int sizePackage = scanner.nextInt();
                if (!(sizePackage > 0 && sizePackage < 1000)) {
                    System.out.println("Error! Please check enter size of the package!");
                } else {
                    countPackage = countPotatos / sizePackage;
                    if (countPackage > maxCountPackage) {
                        System.out.println("Not enough packages");
                    } else {
                        System.out.println("Count packages: " + countPackage);
                        int Checkreminder = countPotatos - (sizePackage * countPackage);
                        System.out.println("Reminder potatos: " + Checkreminder);
                        System.out.println("Заказ упакован в мешки:");
                        LetterArray();
                    }
                    counter++;
                    System.out.println("\u001B[32m"+"Next calculation"+"\u001B[0m");
                }
            }
        }
    }

    private static void LetterArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) ('А' + i);}

        for (int i = 1; i <= countPackage; i++) {
            if (i <= array.length) {
                System.out.print(i);
                System.out.println(array[i - 1]);
            } else {
                System.out.println(i + "FIASCO (letters out)");
            }
        }
    }
}