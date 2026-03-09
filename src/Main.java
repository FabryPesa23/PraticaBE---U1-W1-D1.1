public class Main {
    public static void main(String[]args) {

        System.out.println("---- ESERCIZIO 1 ----");

        int result = multiply(3, 3);
        System.out.println(result);

        String concatena = concat("Fabrizio", 23);
        System.out.println(concatena);




    }

    static int multiply(int num1, int num2){
        int res = num1 * num2;
        return res;
    }

    static String concat(String name, int number){
        String numbToString = Integer.toString(number);
        return name + numbToString;
    }




}
