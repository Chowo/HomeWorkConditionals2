public class Main {
    public static void main(String[] args) {
        //Task 01
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 02
        int clientDeviceYear = 2015;
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 03
        int year = 2021;
        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");

        //Task 04
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance <= 20 && deliveryDistance > 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 21 && deliveryDistance <= 60) {
            deliveryTime += 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime += 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else System.out.println("Доставки нет");

        //Task 05
        int monthNumber = 12;
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
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}
