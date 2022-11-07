//        K20-3 Абрамов.К.
//        Приклад 1.2. Ввести інформацію про співробітників фірми (прізвище,
//        ім'я, по батькові, посаду) та їхніх дітей (ім'я, вік). Вивести на екран
 //       інформацію у табличному вигляді.



import java.util.Scanner;

public class RecStor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість співробітників:");
        int kol = sc.nextInt();
        sc.nextLine(); //очищення буфера після введення числа

        Sotrudnik[] sotr = new Sotrudnik[kol];//отримано посилання на масив співробітників

        System.out.println("Введіть інформацію про кожного співробітника:");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i] = new Sotrudnik(); // отримано посилання на i-тий елемент
            // Присвоєння значень полям
            System.out.print("Введіть прізвище " + (i + 1) + " співробітника => ");
            sotr[i].fam = sc.nextLine();
            System.out.print("Введіть його ім`я =>");
            sotr[i].im = sc.nextLine();
            System.out.print("Введіть його по батькові =>");
            sotr[i].otch = sc.nextLine();
            System.out.print("Введіть його посаду =>");
            sotr[i].doljnost = sc.nextLine();
            System.out.print("Введіть кількість дітей =>");
            sotr[i].kolDet = sc.nextInt();
            sc.nextLine(); //очищення буфера

            if (sotr[i].kolDet != 0) {
                sotr[i].reb = new Rebenok[sotr[i].kolDet];
                System.out.println("Діти => ");
                for (int j = 0; j < sotr[i].reb.length; j++) {
                    sotr[i].reb[j] = new Rebenok();

                    System.out.println("Введіть ім`я " + (j + 1) + " дітини => ");
                    sotr[i].reb[j].imaR = sc.nextLine();

                    System.out.println("Введіть його вік => " + (j + 1));
                    sotr[i].reb[j].vozrastR = sc.nextInt();
                    sc.nextLine();
                }
            }
        }

        System.out.println("\nСпівробітники фірми:\n фам\tім`я\tотч\t посада");
        for (int i = 0; i <  sotr.length; i++){
            System.out.println(sotr[i].fam + "\t" +  sotr[i].im + "\t" +  sotr[i].otch + "\t"
                    +  sotr[i].doljnost);
            System.out.println("Діти: ");
            if(sotr[i].reb == null){
                System.out.println("немає дітей");
            }else{
                for (int j = 0; j < sotr[i].reb.length; j++){
                    System.out.println("\t\t" + sotr[i].reb[j].imaR + "\t\t" + sotr[i].reb[j].vozrastR);
                    System.out.println();
                }
            }

        }

    }
}


