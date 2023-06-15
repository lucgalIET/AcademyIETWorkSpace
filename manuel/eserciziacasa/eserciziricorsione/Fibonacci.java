package manuel.eserciziacasa.eserciziricorsione;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    static public int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int tmp = fibonacci(n-1)+fibonacci(n-2);
        return tmp;
    }
}
