# TMS HomeWork1 Task1
## Условие задачи:
Передаём через командную строку одно число. Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное. Например, "this is a single digit number" и "this is a positive number". Достаточно будет определить, является ли число однозначным, двузначным или трехзначным и более. Учтите, что 0 не является положительным или отрицательным числом.
### Дополнительно:
с помощью операторов "/" (деление) и "%" (модуль) определить количество цифр в числе даже если оно 4-значное и более.
## My code is:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if (num != 0) {
            if (Math.abs(num) < 10) {
                System.out.println("this is a single digit number");
            } else if (Math.abs(num) < 100) {
                System.out.println("this is a two-digit number");
            } else if (Math.abs(num) < 1000) {
                System.out.println("this is a three-digit number");
            }

            if (num < 0) {
                System.out.println("this is a negative number");
            } else if (num > 0) {
                System.out.println("this is a positive number");
            }

            String number = Double.toString(Math.abs(num));
            int n = number.length();
            System.out.println(n-2); // почему-то при любых значениях выводит число большее на 2
        } else {
            System.out.println("ERROR, number = 0 !!!");
        }
    }
}
```
