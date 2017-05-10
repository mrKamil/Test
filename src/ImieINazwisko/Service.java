package ImieINazwisko;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kamil on 2016-08-18.
 */
public class Service {
    static Scanner scanner = new Scanner(System.in);

    protected static String getUserInput() {
        return scanner.next();
    }

    protected static Integer getUserInputInt() {
        return scanner.nextInt();
    }

    protected static ArrayList<Object> bazaDanych = new ArrayList<Object>() {

    };

}