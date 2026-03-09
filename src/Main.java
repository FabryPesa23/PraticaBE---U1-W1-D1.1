import java.util.Arrays;

public class Main {
    public static void main(String[]args) {

        System.out.println("---- ESERCIZIO 1 ----");

        int result = multiply(3, 3);
        System.out.println(result);

        String concatena = concat("Fabrizio", 23);
        System.out.println(concatena);

        String[] base = {"Uno", "Due", "Quattro", "Cinque", "Sei"};
        String[] newString = inserisciInArray(base, "Tre");
        System.out.println(Arrays.toString(newString));

    }

    static int multiply(int num1, int num2){
        int res = num1 * num2;
        return res;
    }

    static String concat(String name, int number){
        String numbToString = Integer.toString(number);
        return name + numbToString;
    }

    public static String[] inserisciInArray(String[] arrayCinque, String nuovaStringa){
        String[] arraySei = new String[6];

        arraySei[0] = arrayCinque[0];
        arraySei[1] = arrayCinque[1];
        arraySei[2] = nuovaStringa;
        arraySei[3] = arrayCinque[2];
        arraySei[4] = arrayCinque[3];
        arraySei[5] = arrayCinque[4];

        return arraySei;
    }




}
