public class Main {
    public static void main(String[] args) {

        int account = 200; // Сумма на счету клиента
        int payment = 1500; // Сумма пополнения счета

        int bonus;  // Количество положенных бонусов
        if(payment > 1000) {
            bonus = payment / 100 * 1;
        } else {
            bonus = 0;
        }

        /* int bonus = payment > 1000 ? payment / 100 * 1 : 0; */

        int amount = account + payment + bonus; // Итоговая сумма на счету клиента

        System.out.println("Сумма на счету: " + amount);
        System.out.println("Количество бонусов: " + bonus);
    }
}