import java.util.Scanner;

public class Main_v2 {
    public void main(String[] args) {
        Data cycle = new Data();
        System.out.println("Введите сумму займа, процент и ежемесячный платеж через пробел");
        Scanner scan = new Scanner(System.in);
        float sum = scan.nextFloat();
        float perc = scan.nextFloat();
        float pay = scan.nextFloat();
        float remaind;
        int ser;
        float overP;
        System.out.println(sum + "" + perc + "" + pay);
        if (sum > 0 && perc > 0 && pay > 0) {
            Scanner per = new Scanner(System.in);
            System.out.println("Введите тип клиента (bus) (hum)");
            String type = per.nextLine();
            System.out.println("Вы выбрали " + type);
            switch (type) {
                case "bus":
                    cycle.data();
                case "hum":
                    remaind = sum + sum * (perc / 100);
                    cycle.data();
            }
        }

    }

    public static class Data {
        public void data() {
            for (float i = remaind; i >= 0; i = i - pay) {
                if (ser <= 11) {
                    ser = ser + 1;
                } else if (ser == 12) {
                    ser = 0;
                    overP = i * (perc / 100);
                    i = i + overP;
                    if (remaind <= i) {
                        System.out.println("Невозможно выплатить");
                        System.exit(0);
                    }
                }
            }
            float dil = overP + overP; // Переплата всего
            System.out.println("Переплата составит " + dil);
        }
    }
}



















