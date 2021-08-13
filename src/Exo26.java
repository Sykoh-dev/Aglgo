import java.util.Random;
import java.util.Scanner;

public class Exo26 {
    public static void main(String[] args) {
        //exo26-À l’aide des boucles, réalisez un algorithme
        //permettant de trier un tableau d’entiers dans l’ordre croissant.

        //Déclaration
        int tailleTab = 10, temp = 0;
        int[] tab = new int[tailleTab];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Affichage du tableau non trier
        System.out.println("Valeur avant le tri");
        for ( int i = 0; i < tailleTab; i++ )

        //Ajout de valeur random au tableau
        {
            tab[i] = random.nextInt(100);
            System.out.print(tab[i] + " ");
        }

        //Boucle pour aller dans tout le tableau
        for (int i = 0; i < tailleTab; i++)
            {
                //Boucle pour comparer les valeurs et les remettres dans l'orde
                for ( int j = 1; j < (tailleTab-1); j++)
                {
                    if (tab[j-1] > tab[j])
                    {
                        temp = tab[j - 1];
                        tab[j - 1] = tab[j];
                        tab[j] = temp;
                    }
                }
            }
        //Affichage du tableau trier
        System.out.println("\nValeur après le tri");
        for ( int i = 0; i < tailleTab; i++ )
        {
            System.out.print(tab[i] + " ");
        }
    }
}
