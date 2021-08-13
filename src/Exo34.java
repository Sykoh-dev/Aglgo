import java.util.Random;
import java.util.Scanner;

public class Exo34 {

    //FONCTION
    public static int recherche(int nb,int tailleTab, int[] tab){

        int indice = -1;
        for (int i = 0; i < tailleTab-1; i++)
        {
            //Condition pour afficher la position
            if (nb == tab[i])
            {
                indice = i;
            }

        }

        return (indice);
    }

    public static void main(String[] args) {
        //exo34-Réalisez une fonction de recherche dans un tableau.
        // Cette fonction va recevoir un tableau, la taille du tableau,
        // et la valeur recherchée en paramètres et renvoyer l’indice de l’élément
        // dans le tableau. Si l’élément ne s’y trouve pas, la fonction renvoie -1.

        //Déclaration
        int tailleTab = 10, nb = 0, indice = -1;
        int[] tab = new int[tailleTab];
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Ajout de valeur au tableau
        for (int i = 0; i < tailleTab; i++)
        {
            tab[i] = random.nextInt(100);
            System.out.print(tab[i] + " ");
        }

        //Choix du nombre à vérifier
        System.out.println("\nChoissisez un nombre pour voir si il est dans le tableau");
        nb = Integer.parseInt(sc.nextLine());

        System.out.println("le nombre se trouve à la position" + " " + recherche(nb, tailleTab,tab));

    }
}
