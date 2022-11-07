//         K20-3 Абрамов.К.
//        Приклад 1.1. Ввести інформацію про співробітників фірми (прізвище,
//        ім'я, по батькові, посаду, оклад). Вивести на екран інформацію у табличному
//        вигляді.


import java.util.Scanner;

public class Firma {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть кількість співробітників:");
        int kol=sc.nextInt();
        sc.nextLine(); //очищення буфера після введення числа

        Sotrudnik[] sotr= new Sotrudnik[kol];//отримано посилання на масив співробітників

        System.out.println("Введіть інформацію про кожного співробітника:");
        for (int i = 0; i < sotr.length; i++) {
            sotr[i]=new Sotrudnik(); // отримано посилання на i-тий елемент
            // Присвоєння значень полям
            System.out.print("Введіть прізвище "+(i+1)+" співробітника => ");
            sotr [i]. fam = sc.nextLine ();
            System.out.print("Введіть його ім`я =>");
            sotr[i].im=sc.nextLine();
            System.out.print("Введіть його по батькові =>");
            sotr[i].otch=sc.nextLine();
            System.out.print("Введіть його посаду =>");
            sotr[i].doljnost=sc.nextLine();
            System.out.print("Введіть його оклад =>");
            sotr[i].oklad=sc.nextInt();
            sc.nextLine(); //очищення буфера
        }

        System.out.println("\nСпівробітники фірми:\n фам\tім`я\tотч\t посада \tОклад ");
        for (int i = 0; i < sotr.length; i++) {
            System.out.println(sotr[i].fam+ "\t"+sotr[i].im + "\t"+sotr[i].otch
                    + "\t"+sotr[i].doljnost + "\t\t" + sotr[i].oklad);
        }
    }
}
