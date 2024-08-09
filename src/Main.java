public class Main {
    public static void main(String[] args) {
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения iOS по ссылке.");
        }
        if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }

        int clientOs1 = 1;
        int clientDeviceYear = 2015;
        if (clientOs1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения iOS по ссылке.");
        } else if (clientOs1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения iOS по ссылке.");
        }
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOs1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }

        int year = 2020;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + "Год является високосным");
            } else {
                System.out.println(year + "Год не является високосным");
            }

            int deliveryDistance = 95;
            int days = 1;
            if (deliveryDistance < 20) {
                System.out.println("Потребуется количество дней " + days);
            } else if(deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется количество дней " + (days + 1));
            } else if(deliveryDistance >= 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется количество дней " + (days + 2));
            } else {
                System.out.println("Доставки нет.");
            }
        }
    }
}