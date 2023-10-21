// Muestra todos los números pares entre A y B

public class Pares {
    
    // Lee un número por teclado y lo devuelve
    public static int leerNumero() {
	int n;
	System.out.print("Escriba un número entero: ");
	n = Integer.parseInt(System.console().readLine());
	return n;
    }

    // Muestra por la consola los números pares entre a y b
    public static void mostrarPares(int a, int b) {
        int i;
        
	if (a < b)
	   inicio = a;
	   fin = b;
	else {
	   inicio = b;
	   fin = a;
        }
        
        if ( inicio % 2 != 0) inicio++;
        
        i = inicio;
        
        while (i <= final) {
	      System.out.println(i);
	      i = i + 2;
	    }
	} // else
    }
    
}







