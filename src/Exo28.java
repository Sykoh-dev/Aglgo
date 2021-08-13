import java.util.Random;
import java.util.Scanner;

public class Exo28 {
    public static void main(String[] args) {
        //exo28-Réalisez un algorithme permettant de rechercher une valeur dans un tableau.
        //Si la valeur se trouve bien dans le tableau,
        //nous affichons sa position sinon il affiche -1.

        //Déclaration
        int tailleTab = 10, nb, temp = 0, notTab;
        int[] tab = new int[tailleTab];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Ajout de valeur au tableau
        for (int i = 0; i < tailleTab-1; i++)
        {
            tab[i] = random.nextInt(100);
            System.out.print(tab[i] + " ");
        }

        //Choix du nombre à vérifier
        System.out.println("\nChoissisez un nombre pour voir si il est dans le tableau");
        nb = Integer.parseInt(sc.nextLine());

        notTab = 0;

        //Boucle pour chercher le nombre
        for (int i = 0; i < tailleTab-1; i++)
        {
            //Condition pour afficher la position
            if (nb == tab[i])
            {
                System.out.println("le nombre se trouve à la position" + " " + i );
                notTab = 1;
            }
        }

        //Condition pour afficher -1 si le nombre n'est pas présent
        if ( notTab == 0 )
        {
            System.out.println("-1");
        }


    }
}
