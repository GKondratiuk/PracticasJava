class Color {

   // Las clases Blanco y Negro están anidadas en Color

   class Blanco {
      Blanco() {
         System.out.println(“Soy un color blanco”);
      }
   }
   class Negro {
      Negro() {
         System.out.println(“Soy un color negro”);
   }

   // Aquí empiezan los métodos de la clase Color

   pintaBlanco() {
      Blanco bl = new Blanco();
   }
   pintaNegro() {
      Negro ng = new Negro();
   }
}
