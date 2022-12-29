import java.util.Scanner;
public class Calculate {
    public static void main(String[] args) {
        // Общие входные данные
        Scanner Per = new Scanner(System.in);
        System.out.println("Введите тип клиента (bus) (hum)"); // уточнить тип 1-hum 0-bus
        String x = Per.nextLine();
        System.out.println("Вы выбрали тип "+x);
        switch (x) {
            case "bus":
                Scanner Money = new Scanner(System.in);
                System.out.println("Введите сумму займа");// сумма займа
                float y = Money.nextInt();
                if (y > 1) {
                    System.out.println("Вы заняли: " + y);
                    Scanner Perс = new Scanner(System.in);
                    System.out.println("Введите процент"); // сумма займа
                    float z = Perс.nextInt();
                    if (z > 0) {
                        System.out.println("Ваш процент: " + z);
                        Scanner Pay = new Scanner(System.in);
                        System.out.println("Введите сумму ежемесячного платежа"); // сумма займа
                        float p = Pay.nextInt();
                        if (p > 1) {
                            System.out.println("Ваш платеж: " + p);
                            float a = y; //остаток по кредиту
                            int e = 0; // цикл проверки
                            float m = 0; //переплата за год
                            for (float i = y; i >= 0; i = i - p) {
                                System.out.println("Вы заплатли " + p);
                                System.out.println("Остаток " + i);
                                if (e <= 11) {
                                    e = e + 1;
                                    System.out.println("месяцев до начисления -" + e);
                                } else if (e == 12) {
                                    e = 0;
                                    m = i * (z / 100);
                                    System.out.println("Начисленно " + m);
                                    i = i + m;
                                    System.out.println("Остаток долга " + i);
                                    if (y <= i) {
                                        System.out.println("Невозможно выплатить");
                                        System.exit(0);
                                    }
                                }

                            }float Dil=m+m; // Переплата всего
                            System.out.println("Переплата составит "+Dil);
                        }
                    }
                }
                break;
            case "hum":
                Scanner Sum = new Scanner(System.in);
                System.out.println("Введите сумму займа");// сумма займа
                float n = Sum.nextInt();
                if (n> 0) {
                    System.out.println("Вы заняли: " + n);
                    Scanner Perс = new Scanner(System.in);
                    System.out.println("Введите процент"); // сумма займа
                    float z = Perс.nextInt();
                    if (z > 0) {
                        System.out.println("Ваш процент: " + z);
                        Scanner Pay = new Scanner(System.in);
                        System.out.println("Введите сумму ежемесячного платежа"); // сумма займа
                        float p = Pay.nextInt();
                        if (p > 1) {
                            System.out.println("Ваш платеж: " + p);
                            float a = n + n * (z / 100); //остаток по кредиту
                            int e = 0; // цикл проверки
                            float m = 0; //переплата за год
                            for (float i = a; i >= 0; i = i - p) {
                                System.out.println("Вы заплатли " + p);
                                System.out.println("Остаток " + i);
                                if (e <= 11) {
                                    e = e + 1;
                                    System.out.println("месяцев до начисления -" + e);
                                } else if (e == 12) {
                                    e = 0;
                                    m = i * (z / 100);
                                    System.out.println("Начисленно " + m);
                                    i = i + m;
                                    System.out.println("Остаток долга " + i);
                                    if (a <= i) {
                                        System.out.println("Невозможно выплатить");
                                        System.exit(0);
                                    }
                                }
                            }float Dil=m+m; // Переплата всего
                            System.out.println("Переплата составит "+Dil);
                        }
                    }
                }
                break;

        }

    }
}


