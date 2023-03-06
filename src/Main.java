import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 9 caracteres en mayúsculas para el juego:");
        String caracteres = teclado.nextLine();

        int cadena = caracteres.length();

        if (cadena == 9) {

            System.out.println(" ----- ");
            System.out.println("| " + caracteres.charAt(0) + caracteres.charAt(1) + caracteres.charAt(2) + " |");
            System.out.println("| " + caracteres.charAt(3) + caracteres.charAt(4) + caracteres.charAt(5) + " |");
            System.out.println("| " + caracteres.charAt(6) + caracteres.charAt(7) + caracteres.charAt(8) + " |");
            System.out.println(" ----- ");

        } else {
            System.out.println("Se necesitan 9 caracteres");
        }
    }
}