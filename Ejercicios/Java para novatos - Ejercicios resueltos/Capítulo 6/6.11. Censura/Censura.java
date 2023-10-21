package censura;

public class Censura {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Error: debe especificar el nombre del fichero en la línea de comandos.");
        } else {
            // Descomentar para censurar caracteres sueltos
            //Censurador.censurarCaracteres(args[0]);
            Censurador.censurarFrases(args[0]);
        }
    }

}
