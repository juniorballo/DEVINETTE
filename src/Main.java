import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // debut du jeu
        Scanner scanner = new Scanner(System.in);
        int nombreADevinner = new Random().nextInt(100) + 1; // Nombre a devinner entre 1 et 100
        int nombreEssaiMaxi = 10;  // nombre d'essai
        boolean trouver = false;

        System.out.println("Devinez le nombre compris entre 1 et 100 ");

        for (int i = 1; i <= nombreEssaiMaxi; i++) {
            System.out.print("Essai " + i + " : ");
            int nombreUtilisateur = scanner.nextInt(); // prend le nombre entré de l'utilisateur

            if (nombreUtilisateur == nombreADevinner) {
                System.out.println("felicitatation , vous avez trouvé le Nombre!");
                trouver = true;
                break; // Arrête la boucle
            } else if (nombreUtilisateur < nombreADevinner) {
                System.out.println("le nombre à deviner est  plus grand ");
            } else {
                System.out.println("le nombre à deviner est plus petit ");
            }
        }

        // Message de fin si l'utilisateur n'a pas trouvez le nombre
        if (!trouver) {
            System.out.println("vous avez perdu car le nombre à devinner était : " + nombreADevinner);
        }

        scanner.close();
    }
}