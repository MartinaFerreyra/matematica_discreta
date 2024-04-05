
package actividad.pkg1;
import java.util.Scanner;
public class Actividad1 {
    public static void main(String[] args) {
 /*
   Realice un programa en Java que pida al usuario ingresar un numero binario de 16 digitos y muestre 
   a que numero octal, decimal y hexadecimal corresponde.        
  */   
Scanner obj = new Scanner(System.in);
        long numero;
        int residuo, c = 0, decimal = 0;

        System.out.print("Digite un numero binario de 16 digitos: ");
        numero = obj.nextLong();

        // Verificar si el número ingresado es binario
        boolean esBinario = true;
        long temp = numero;
        while (temp != 0) {
            residuo = (int)(temp % 10);
            if (residuo != 0 && residuo != 1) {
                esBinario = false;
                break;
            }
            temp /= 10;
        }

        if (!esBinario || String.valueOf(numero).length() != 16) {
            System.out.println("Error, ingrese un numero binario de 16 digitos (0 o 1).");
        } else {
            while (numero != 0) {
                residuo = (int)(numero % 10);
                decimal += residuo * Math.pow(2, c);
                c++;
                numero /= 10;
            }
            System.out.println("El número decimal es: " + decimal);
            System.out.println("El número octal es: " + Integer.toOctalString(decimal));
            System.out.println("El número hexadecimal es: " + Integer.toHexString(decimal));
        }
    }
}