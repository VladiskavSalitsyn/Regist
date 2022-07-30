import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите имя пользователя:");
        String name = new Scanner(System.in).next();
        System.out.println(name);
        System.out.println();
        System.out.println("Введите возраст:");
        int age = new Scanner(System.in).nextInt();

        boolean Age = age >= 14 && age <= 80;

        if (Age) {
            System.out.println(age);
        } else {
            System.out.println("Допустимое возраст 14-80 лет");
        }
    }
}

