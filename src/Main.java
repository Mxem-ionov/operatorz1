
public class Main {
    public static void main(String[] args) {

        int clientOS = 1;
        if (clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1)
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        int clientOSe = 0;
        int clientDeviceYear = 2014;
            if  (clientOSe == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (clientOSe == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOSe == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOSe == 1 && clientDeviceYear <= 2015)  {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        int year = 1588;
            if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year > 1584) {
                System.out.println("Год является високосным.");
            }
            else {
                System.out.println("Год не високосный.");
            }
        int deliveryDistance = 40;
        int day = 1;
            if (deliveryDistance <= 20) {
                 System.out.println("Потребуется дней: " + day);
           }
           else if (deliveryDistance > 20 && deliveryDistance <= 60) {
                 System.out.println("Потребуется дней: " + (day + 1));
           }
           else if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: " + (day + 2));
           }
           else {
                System.out.println("Доставка не осуществляется");
           }
        int monthNumber = 4;
           switch (monthNumber) {
               case 1:
               case 2:
               case 12:
                   System.out.println("время года: зима");
                   break;
               case 3:
               case 4:
               case 5:
                   System.out.println("время года: весна");
                   break;
               case 6:
               case 7:
               case 8:
                   System.out.println("время года: лето");
                   break;
               case 9:
               case 10:
               case 11:
                   System.out.println("время года: осень");
                   break;
               default:
                   System.out.println("Такого времени года не существует");
           }


    }
}



