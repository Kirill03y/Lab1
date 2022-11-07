//        K20-3 Абрамов.К.
//                              Варіант 1
//        Розробити клас для зберігання інформації про автомобілі:
//        Модель, рег_номер, рік_випуску, пробіг, вартість
//        та реалізувати алгоритм роботи з масивом даних об&#39;єктів, в якому потрібно:
//        – визначити найдешевший автомобіль;
//        – упорядкувати масив за зменшенням року випуску;
//        – організувати пошук за реєстраційним номером, виправлення одного з
//        полів та виведення повної інформації про автомобіль після редагування.
//        1- й проект – без використання методів;


import  java.util.Scanner;

public class carRecord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 4;
        Cars[] cars = new Cars[count];
        cars[0] = new Cars("BMW", "AE5610EB", 2005, 120320, 12000);
        cars[1] = new Cars("Audi", "AA1223EX", 2016, 96000, 20000);
        cars[2] = new Cars("Ford", "AP7516EV", 2010, 250150, 9000);
        cars[3] = new Cars("Mazda", "AE5621NT", 2019, 25300, 19000);

        System.out.println("Автомобілі:");
        for(int i = 0; i < cars.length; i++){
            System.out.println("\t" + cars[i].car_model + " \t" + cars[i].reg_number + " \t" +
                    cars[i].year_manufactured + " \t" + cars[i].car_mileage + " \t" + cars[i].car_cost);
        }

        //Визначити найдешевший автомобіль
        Cars cheapestCar = cars[0];
        for (int i = 0; i < cars.length; i++){
            if (cars[i].car_cost < cheapestCar.car_cost){
                cheapestCar = cars[i];
            }
        }
        System.out.println("Найдешевний автомобіль: " + cheapestCar.car_model + " \t" + cheapestCar.reg_number + " \t" +
                "  Вартість:\t" + cheapestCar.car_cost);

        //упорядкувати масив за зменшенням року випуску;
        System.out.println("Упорядкований масив за зменшенням року випуску:");
        for (int i = 0; i < cars.length-1; i++)
            for (int j = 0; j < cars.length-i-1; j++)
                if(cars[j].year_manufactured < cars[j+1].year_manufactured){
                    Cars temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
        for(int i = 0; i < cars.length; i++){
            System.out.println("\t" + cars[i].car_model + " \t" + cars[i].reg_number + " \t" +
                    cars[i].year_manufactured + " \t" + cars[i].car_mileage + " \t" + cars[i].car_cost);
        }


        //організувати пошук за реєстраційним номером, виправлення одного з
        //полів та виведення повної інформації про автомобіль після редагування.

        int index;
        System.out.print("\nВведіть реестраційний номер:");
        String reg_numb = sc.nextLine();

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].reg_number.equals(reg_numb)) {
                index = i;

                System.out.println("Выберите что нужно исправить: ");
                System.out.println("1 Модель \n2 Номер \n3 Рік випуску \n4 Пробіг \n5 Вартість ");
                System.out.print("");
                int operation = sc.nextInt();
                sc.nextLine();

                switch (operation) {
                    case 1:
                        System.out.print("Введіть нову модель: ");
                        cars[i].car_model = sc.nextLine();
                        break;
                    case 2:
                        System.out.print("Введіть новий номер: ");
                        cars[i].reg_number = sc.nextLine();
                        break;
                    case 3:
                        System.out.print("Введіть новий рік: ");
                        cars[i].year_manufactured = sc.nextInt();
                        break;
                    case 4:
                        System.out.print("Введіть новий пробіг: ");
                        cars[i].car_mileage = sc.nextInt();
                        break;
                    case 5:
                        System.out.print("Введіть нову ватртість ");
                        cars[i].car_cost = sc.nextInt();
                        break;
                    default:
                        System.out.print("Такий пункт відсутній");
                        break;
                }

                System.out.println("Оновлена інформація: ");
                System.out.println("\t" + cars[i].car_model + " \t" + cars[i].reg_number + " \t" +
                        cars[i].year_manufactured + " \t" + cars[i].car_mileage + " \t" + cars[i].car_cost);
            }
        }
    }
}
