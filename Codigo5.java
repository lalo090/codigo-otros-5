import java.util.Scanner;  //faltaba importar el scanner

public class Codigo5 {
    public static void main(String[] args) {  //faltaba el public static void
        Scanner sc = new Scanner(System.in);  //sc, faltaba system.in
        System.out.print("Introduzca un número: "); //tenia una ' en lugar de "
        int ni = sc.nextInt();   //sc  el valor seria int en lugar de line
        int c = ni;
        
        int afo = 0;
        int noAfo = 0;
        
        while (ni > 0) {
            int digito = ni % 10;  
            if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) 
		{  //no estaba abierta
                afo++;
            } else {
                noAfo++;
            }
            ni /= 10;
        }

        if (afo > noAfo) {
            System.out.println("El " + c + " es un número afortunado.");
        } else {
            System.out.println("El " + c + " no es un número afortunado.");
        }
    }
}