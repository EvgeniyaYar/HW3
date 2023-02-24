public class Main {
    public static void main(String[] args) {

        int a = 200; // Сумма на счету клиента
        int b = 1500; // Сумма пополнения счета

        int bonus;  // Количество положенных бонусов
        if(b > 1000) {
            bonus = b / 100 * 1;
        } else {
            bonus = 0;
        }

        /* int bonus = b > 1000 ? b / 100 * 1 : 0; */

        int amount = a + b + bonus; // Итоговая сумма на счету клиента

        System.out.println("Сумма на счету: " + amount);
        System.out.println("Количество бонусов: " + bonus);
    }
}