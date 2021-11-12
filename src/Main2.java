public class Main2 {
    public static void main(String[] args) {
        int balance = 100; //баланс
        int b = 20000;  //сумма пополнения

        int percent;
        if (b > 1000) {
            percent = 1;

            int bonus = b * percent / 100;

            System.out.println("Итоговый бонус: " + bonus);

            int sum = balance + b + bonus;

            System.out.println("Итоговый баланс: " + sum);
        } else {
            int sum = balance + b;

            System.out. println ("Итоговый баланс: " + sum);
        }
    }

}
