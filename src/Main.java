import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 5");
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2012;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задание 3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int day = 1;
        if  (deliveryDistance < 20){
            System.out.println("Понадобится " + day + " дня");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Понадобится " + (day+1) +" дня");
        } else if (deliveryDistance>60 && deliveryDistance <=100) {
            System.out.println("Понадобится " + (day+2) + " дня");
        } else {
            System.out.println("Доставки нет");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 11:
            case 10:
                System.out.println("Oсень");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}




