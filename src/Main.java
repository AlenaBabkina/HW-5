public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Задача 1");
            int clientOS = 1;
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android");
            } else {
                System.out.println("Ваша операционная система не поддреживаает данное приложение");
            }
        }

        {
            System.out.println("Задача 2");
            int clientPeviceYear = 2010;
            int clientOS = 1;
            if (clientOS == 0 && clientPeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложение для iOS по ссылке");
            } else if (clientOS == 1 && clientPeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 1 && clientPeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложение для Android по ссылке");
            } else if (clientOS == 1 && clientPeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        {
            System.out.println("Задача 3");
            int year = 2004;
            if (year > 1584) {
                if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
                    System.out.println(year + " год является високосным");
                } else {
                    System.out.println(year + " год не является високосным");
                }
            } else {
                System.out.println("Год не может быть меньше 1585");
            }
        }

        {
            System.out.println("Задача 4");
            int distance = 50;
            int days = 1;
            if (distance > 100) {
                System.out.println("Доставки нет");
            } else {
                if (distance > 20) {
                    days++;
                }
                if (distance > 60) {
                    days++;
                }
                System.out.println("Потрбуется дней: " + days + " срок доставки");
            }
        }

        {
            System.out.println("Задача 5");
            int month = 15;
            switch (month) {
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
                    System.out.println("Такого месяца нет");
            }
        }
    }
}