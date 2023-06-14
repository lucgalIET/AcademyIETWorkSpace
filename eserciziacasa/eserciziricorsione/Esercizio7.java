package eserciziacasa.eserciziricorsione;

public class Esercizio7 {

    public static void main(String[] args) {
        System.out.println(potenza(3,3));
    }

    static public int potenza(int b,int e){
        if(e == 1) return b;
        return b * potenza(b,e-1);
    }
}
