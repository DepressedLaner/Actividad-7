package Actividad7;
import java.util.Scanner;

public class prin {
    public static void main(String[] args) throws Exception {

        Scanner Skan = new Scanner(System.in);
        TClase Objs = new TClase();
        
        int n;     
        
        System.out.print("Ingrese valor para su analisis: ");
        n = Skan.nextInt();
        
        System.out.println("");
        
        int[] Aprimos = new int[n];
        
        Aprimos = Objs.Aprimo(Aprimos);
        
        int[] Afibonacci = new int[n];
        
        Afibonacci = Objs.Afibonacci(Afibonacci);
        
        System.out.print("Fibonacci ");
        Objs.Printer(Afibonacci);
        System.out.print("Primos ");
        Objs.Printer(Aprimos);

    }
}
