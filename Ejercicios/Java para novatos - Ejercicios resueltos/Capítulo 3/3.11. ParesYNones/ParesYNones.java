// Muestra todos los pares o impares que hay entre un número a y otro b.
// Reutiliza las clases Pares e Impares que programamos en ejercicios anteriores.

public class ParesYNones {
    
    // Muestra por la consola los números pares o impares a y b
    public void mostrar(int a, int b, String paresOImpares) {
    
      if (paresOImpares.equals("pares")) {
        Pares p = new Pares();
	p.mostrarPares(a,b);
      }
      if (paresOImpares.equals("impares")) {
        Pares p = new Impares();
	p.mostrarImpares(a,b);
      }
    
    }
    
}







