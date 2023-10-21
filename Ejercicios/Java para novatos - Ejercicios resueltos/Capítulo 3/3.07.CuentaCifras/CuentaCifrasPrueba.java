class CuentaCifrasPrueba {

  public static void main(String[] args) {
	int n;

	System.out.print("Escriba un numero (0-99999): ");
	n = Integer.parseInt(System.console().readLine());
	
	CuentaCifras cf = new CuentaCifras();
	System.out.println("El número " + n + " tiene " + cf.calculaNumCifras(n) + " cifras");
  }  
}
