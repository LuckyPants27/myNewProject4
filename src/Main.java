public class Main {
    public static void main(String[] args) {

        int clientOS = 1;
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int clientDeviceYear = 2015;
        int borderYear = 2015;
        if (clientOS == iOS && clientDeviceYear < borderYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == iOS && clientDeviceYear >= borderYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android && clientDeviceYear < borderYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == android && clientDeviceYear >= borderYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int year = 2021;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 00) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        int deliveryDistance = 91;
        int deliveryDays = 0;

        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 0) {
            deliveryDays++;
        }

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            deliveryDays++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays++;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет.");
        }


        int monthNumber = 8;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Сезон зима");
                break;
            case 3, 4, 5:
                System.out.println("Сезон весна");
                break;
            case 6, 7, 8:
                System.out.println("Сезон лето");
                break;
            case 9, 10, 11:
                System.out.println("Сезон осень");
                break;
            default:
                System.out.println("Некорректный номер месяца");
        }

    }
}