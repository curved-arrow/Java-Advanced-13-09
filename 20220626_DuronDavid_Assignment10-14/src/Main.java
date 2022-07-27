public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyDate debug_1 = new MyDate();
        MyDate debug_2 = new MyDate(34355555133101L);

        System.out.println("debug_1: " + debug_1.getMonth() + "/" + debug_1.getDay() +
                "/" + debug_1.getYear());
        System.out.println("debug_2: " + debug_2.getMonth() + "/" + debug_2.getDay() +
                "/" + debug_2.getYear());
    }
}