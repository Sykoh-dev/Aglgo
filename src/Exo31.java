import java.util.Scanner;

public class Exo31 {
    public static void main(String[] args) {
        //exo31-Réalisez un algorithme dans lequel nous devons rechercher
        //une valeur (entrée par l'utilisateur) dans un tableau d'entiers ,
        //si cette valeur est dans le tableau, on la supprime et on
        //décale tous les éléments suivants.  Le dernier élément est donc 0.

        // Déclaration
        Scanner sc = new Scanner(System.in);
        final int TAB_TAILLE = 6; // nombre d'éléments dans le tableau
        int[] tab = new int[TAB_TAILLE];
        int i = 0, supVal = 0;

        while (i < TAB_TAILLE) {
            System.out.println("Entrez un entier [" + i + "]");
            tab[i] = Integer.parseInt(sc.nextLine());
            i++;
        }

        //Affichage du tableau initial
        for (i = 0; i < TAB_TAILLE; i++) { // Initialisation ; Condition ; Incrémentation
            System.out.print("[" + tab[i] + "]");
        }

        System.out.println("\nVeuillez entrer une valeur à supprimer dans le tableau");
        supVal = Integer.parseInt(sc.nextLine());

        for (i = 0; i < TAB_TAILLE; i++) {
            //Boucle pour comparer les valeurs et supprimer l'entrée
            for (int indice = 1; indice < (TAB_TAILLE - 1); indice++) {
                if (supVal == (tab[indice])) {
                    tab[indice] = tab[indice + 1];
                    supVal = tab[indice];
                }
            }

        }
        //Remise à 0 de la dernière valeur
        tab[TAB_TAILLE-1] = 0;

        //Affichage du nouveau tableau
        for (i = 0; i < TAB_TAILLE; i++) { // Initialisation ; Condition ; Incrémentation
            System.out.print("[" + tab[i] + "]");
        }
    }
}


