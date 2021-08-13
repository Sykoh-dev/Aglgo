import java.util.Scanner;

public class Exo27 {
    public static void main(String[] args) {
        //exo27-Refaites l'algorithme qui demande à l’utilisateur de taper 10 entiers
        //et qui affiche le plus petit de ces entiers mais cette fois-ci à
        //l'aide d'un tableau et sans retenir le minimum lors de la saisie

        //Déclaration
        int tailleTab = 10, min = 0, temp = 0;
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[tailleTab];

        //Ajout de valeur au tableau
        for ( int i = 0; i < tailleTab; i++ )
        {
            System.out.println("Entrez un nombre");
            tab[i] = Integer.parseInt(sc.nextLine());
        }

        //Recherche du plus petit nombre
        for (int i = 0; i < tailleTab; i++)
        {
            for ( int j = 1; j < (tailleTab-i); j++)
            {
                if (tab[j-1] < tab[j])
                {
                    min = tab[j - 1];
                }
            }
        }

        System.out.println("Le plus petit nombre est " + min);
    }

}

