package Ciro.esercizi_ricorsione;
/*
Implementa una funzione iterativa e ricorsiva in Java che stampi i primi 'n' numeri della serie di Fibonacci.
 */
public class Esercizio6 {
    public static void main(String[] args) {

       stampaNumeriFibonacci(15);
        System.out.println("-----------------");
        for(int i = 0 ; i <= 15; i++) {
            System.out.println(stampaFibonacciRicorsivo(i));
        }
    }

    //versione iterativa
    public static void stampaNumeriFibonacci(int n) {

        int fib = 1;
        int prevFib = 1;

        for(int i=0; i<n; i++) {
            int temp = fib;
            fib+= prevFib;
            prevFib = temp;

            System.out.println(i);
        }



    }

    //versione ricorsiva
    public static int stampaFibonacciRicorsivo(int n) {
        if (n <= 1) return n;

        return stampaFibonacciRicorsivo(n - 1) + stampaFibonacciRicorsivo(n - 2);


    }
}
