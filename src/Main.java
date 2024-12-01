
public class Main {
    public static void main(String[] args) {

        int age = 16;
        if (age >= 18)
        {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        else
        {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия нужно подождать.");
        }

        int temp = -5;
        if (temp >= 5) {
            System.out.println("На улице " + temp + " градусов, можно не надевать шапку.");
        }
        else {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        }
        int speed = 54;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " придется заплатить штраф.");}
        else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно.");
        }
        int agePerson = 18;
        if (agePerson >= 2 && agePerson <=6) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в детский сад.");
        }
        if (agePerson >= 7 && agePerson <=17) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в школу.");
        }
        if (agePerson >= 18 && agePerson <24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить в институт.");
        }
        if (agePerson >= 24) {
            System.out.println("Если возраст человека равен " + agePerson + ", то ему нужно ходить на работу.");
        }
        int childAge = 14;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на атракционе.");
        }
        if (childAge >= 5 && childAge <14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на атракционе в сопровождении взрослого.");
        }
        if (childAge >= 14){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на атракционе без сопровождения взрослого.");
        }
        int unit = 26;
        if (unit >= 0 && unit <= 60){
            System.out.println("В вагоне достаточно места, можете выбрать сидячее место.");
        }
        else if (unit > 60 && unit <= 102) {
            System.out.println("Вагон достаточно заполнен, можете выбрать стоячее место.");
        }
        else {
            System.out.println("К сожалению мест больше нет.");
        }
        int one = 3;
        int two = 2;
        int three = 3;
        if (one > two && one > three){
            System.out.println("Самое большое число " + one);
        }
        else if (two > one && two > three){
            System.out.println("Самое большое число " + two);
        }
        else {
            System.out.println("Самое большое число " + three);
        }
    }
}



