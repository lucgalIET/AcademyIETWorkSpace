package EsercizioPianeti.complessita;

//Scrivere un metodo boolean che verifica se un intero è contenuto in un array
public class Esercizio4 {
    public static void main(String[] args) {
        int[] numeri = {9, 2, 3, 1, 5, 20, 7, 10};

        System.out.println(verificaIntero(numeri));
    }

    public static boolean verificaIntero(int[] numeri) {
        boolean isValid = false;
        return verificaInteroImpl(numeri, 0, 10, isValid);
    }

    public static boolean verificaInteroImpl(int[] numeri, int i, int intero, boolean isValid) {
        if (i == numeri.length)
            return isValid;

        if (numeri[i] == intero)
            isValid = true;

        return verificaInteroImpl(numeri, i + 1, intero, isValid);
    }
}
