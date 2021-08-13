import java.util.Scanner;

public class Exo22 {
    public static void main(String[] args) {
        //exo22-Écrire un algorithme qui saisit 6 entiers et les stocke dans un tableau,
        //puis affiche le contenu de ce tableau une fois qu’il est rempli.

        // Déclaration
        Scanner sc = new Scanner(System.in);
        final int TAB_TAILLE = 6; // nombre d'éléments dans le tableau
        int[] tab = new int[TAB_TAILLE];
        int i = 0;

        while (i < TAB_TAILLE) {
            System.out.println("Entrez un entier [" + i + "]");
            tab[i] = Integer.parseInt(sc.nextLine());
            i++;
        }

        // i = 6

        for (i = 0; i < TAB_TAILLE; i++) { // Initialisation ; Condition ; Incrémentation
            System.out.println("tab[" + i + "] = " + tab[i]);
        }
    }
}
