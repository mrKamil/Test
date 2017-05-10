package ImieINazwisko;

import java.util.InputMismatchException;

/**
 * Created by Kamil on 2016-08-18.
 */
public class Main extends Service {

    public static void main(String args[]) {

        while (true) {
            System.out.println("Menu: \n 1: Dodaj \n 2: Sprawdż bazę \n 3: Wielkość bazy \n 4: Usuń pozycję \n 5: Wyjście ");

            int liczba = getUserInputInt();

            switch (liczba) {
                case 1:

                    System.out.println("Podaj Imię ");
                    String name = getUserInput();
                    bazaDanych.add(name);

                    System.out.println("Podaj Nazwisko ");
                    String sName = getUserInput();
                    bazaDanych.add(sName);


                    System.out.print("Podaj wiek ");

                    int age = getUserInputInt();
                    bazaDanych.add(age);


                    break;
                case 2:
                    System.out.println(bazaDanych);
                    break;
                case 3:
                    System.out.println(bazaDanych.size());
                    break;
                case 4:
                    try {
                        System.out.println("Podaj numer który chcesz usunąć ");
                        int usun = getUserInputInt();
                        bazaDanych.remove(usun);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Brak podanej pozycji w bazie. Wielkośc bazy to: " + bazaDanych.size());
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Podałeś złą cyfrę");

            }


        }
    }
}

