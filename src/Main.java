public class Main {


    public static void main(String[] args) {
        int[] numerePare = {2, 4, 6, 8, 11, 13, 15};
        System.out.println("Numerele pare sunt: ");

        for (int i = 0; i < numerePare.length; i++) {
            if (numerePare[i] % 2 == 0) {
                System.out.println(numerePare[i]);
            }
        }
        System.out.println("Numerele impare sunt: ");

        for (int i = 0; i < numerePare.length; i++) {
            if (numerePare[i] %2 != 0) {
                System.out.println(numerePare[i]);
            }
        }
    }


    }

