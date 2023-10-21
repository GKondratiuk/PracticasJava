
/**
 * Esta clase resuelve el ejercicio del array creciente
 * utilizando arrays convencionales
 */
public class MiArray {
    
  public static int[] generar(int tam, int min, int max) {
    // Generamos un array con valores aleatorios
    int[] a = new int[tam];
    for (int i = 0; i < a.length; i++) {
      a[i] = (int)(Math.random()*(max-min+1)) + min;
    }
    return a;
  
  }
  
  public static String toString(int[] a) {
    // Devuelve el contenido del array convertido en un String
    String str = "";
    for (int i = 0; i < a.length; i++) {
      str = str + a[i] + "\n";
    }
    return str;
  }
 
  // Ordena por el método de la burbuja
  public static void ordenar(int[] a) {
    // Se puede hacer con a = Arrays.sort(a)
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length-1; j++) {
	if (a[j] > a[j+1]) {
	  int aux = a[j];
	  a[j] = a[j+1];
	  a[j+1] = aux;
	}
      } // for j
    } // for i
  }  
 
  // Busca el número n en el array. Devuelve la posición de la primera ocurrencia,
  // o -1 si no lo encuentra.
  public static int buscar(int[] a, int n) {
    int encontrado = -1;
    int i = 0;
    while (i < a.length && encontrado != -1) {
      if (a[i] == n) {
	encontrado = i;
      }
      i++;
    }
    
    return encontrado;
  }
  
  public static void insertarOrdenado(int[] a, int n) {
      int pos = buscarPosicionInsercion(a, n);
      desplazarArrayDerecha(a, pos);
      a[pos] = n;
  }
  
  private static int buscarPosicionInsercion(int[] a, int n) {
      int i = a.length - 1;
      int posicion = 0;
      while (i >= 0 && posicion == 0) {
         if (a[i] < n) posicion = i+1;
         i--;
      }
      return posicion;
      
  }
  
  private static void desplazarArrayDerecha(int[] a, int pos) {
      for (int i = a.length - 1; i > pos; i--) {
          a[i] = a[pos];
      }
  }
    
}
