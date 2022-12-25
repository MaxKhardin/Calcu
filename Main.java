import java.util.Scanner;
 public class Main {
     public static void main(String[] args) {
         // Общие входные данные
         Scanner Per = new Scanner(System.in);
         System.out.println("Введите тип клиента (bus) (hum)"); // уточнить тип 1-hum 0-bus
         String x = Per.nextLine();
         switch (x) {
             case "hum":
                 Scanner Sum = new Scanner(System.in);
                 System.out.println("Введите сумму займа");// сумма займа
                 int y = Sum.nextInt();
                 if(y>=1) {
                     System.out.println("Вы заняли: " + y);
                     Scanner Perс = new Scanner(System.in);
                     System.out.println("Введите процент"); // сумма займа
                     int z = Perс.nextInt();
                     if(z>=0){
                     System.out.println("Ваш процент: " + z);
                     Scanner Pay = new Scanner(System.in);
                     System.out.println("Введите сумму ежемесячного платежа"); // сумма займа
                     int p = Pay.nextInt();
                     if(p>=0)
                     System.out.println("Ваш платеж: " + p);
                     int e;
                     int a = y + z;// остаток долга
                     int m; //Переплата за год
                     int С = +m; // Переплата всего
                     int i; //счетчик месяцев до начисления процентов
                     if (i < 13) {
                         for (int e = a; e < 0; a - p) {// остаток после платежа
                             i = 0++;
                             switch (i) {
                                 case 12:                    //если месяц номер 12 начислить процент
                                     m = a * (z / 100);
                                     e = a + a * (z / 100);
                                     break;
                             }
                         }
                     }

                     }

                     break;
                     System.out.println("Переплата составит" + С);
                 }
                 else


                         break;
                         case "bus":
                             Scanner Sum = new Scanner(System.in);
                             System.out.println("Введите сумму займа");// сумма займа
                             int y = Sum.nextInt();
                             System.out.println("Вы заняли: " + y);
                             Scanner Perс = new Scanner(System.in);
                             System.out.println("Введите процент"); // сумма займа
                             int z = Perс.nextInt();
                             System.out.println("Ваш процент: " + z);
                             Scanner Pay = new Scanner(System.in);
                             System.out.println("Введите сумму ежемесячного платежа"); // сумма займа
                             int p = Pay.nextInt();
                             System.out.println("Ваш платеж: " + p);
                             int e; // остатко с процентами
                             int a = y;// остаток долга
                             int c; //Переплата за год
                             int С=+c; // Переплата всего
                             int i; //счетчик месяцев до начисления процентов
                             if (i <13) {
                                 for (int e = a; e < 0; a - 10000) {// остаток после платежа
                                     i = 0++;
                                     switch (i) {
                                         case 12:                    //если месяц номер 12 начислить процент
                                             c=a*(z/100);
                                             e = a + a * (z / 100);
                                             break;
                                     }
                                 }
                             }

                             break;
                             System.out.println("Переплата составит"+С);

                     }
                     System.out.println("Ошибка");
                     System.exit(0);


                 }
         }


            //остаток долга a
           // остаток на конец периода e=y-z
            // если счетчик L/12=1, то c=e+e*(y/100)
            // счетчик сбрасывается если L= 12
            // значение e подставляется в a
            // все в цикл пока a<=0









