import java.util.Scanner;

public class Exo30 {
    public static void main(String[] args) {
        //exo30-En considérant un tableau d'entiers trié dans l'ordre croissant,
        //réalisez un algorithme étant capable d'insérer une nouvelle valeur dans
        //le tableau de façon à ce que le tableau reste trié. Le but n'est évidemment
        //pas d'insérer la valeur à la fin et de trier après mais bien de l'insérer
        //au bon endroit directement.

        // Déclaration
        Scanner sc = new Scanner(System.in);
        final int TAB_TAILLE = 6; // nombre d'éléments dans le tableau
        int[] tab = new int[TAB_TAILLE];
        int i = 0, newVal = 0, temp = 0;

        while (i < TAB_TAILLE -1) {
            System.out.println("Entrez un entier [" + i + "]");
            tab[i] = Integer.parseInt(sc.nextLine());
            i++;
        }

        //Affichage du tableau initial
        for (i = 0; i < TAB_TAILLE; i++) { // Initialisation ; Condition ; Incrémentation
            System.out.print("[" + tab[i] + "]");
        }

        System.out.println("\nVeuillez entrer une valeur à insérer dans le tableau");
        newVal = Integer.parseInt(sc.nextLine());

        for (i = 0; i < TAB_TAILLE; i++) {
            //Boucle pour comparer les valeurs et les remettres dans l'orde
            for (int indice = 1; indice < (TAB_TAILLE); indice++) {
                if ( newVal < tab[indice] ) {
                    temp = tab[indice];
                    tab[indice] = newVal;
                    newVal = temp;
                }
                else if ( tab[indice] == 0) {
                    tab[indice] = newVal;
                }
            }
        }
        //Affichage du tableau avec la nouvelle valeur
        for (i = 0; i < TAB_TAILLE; i++) { // Initialisation ; Condition ; Incrémentation
            System.out.print("[" + tab[i] + "]");
        }

        }
    }
