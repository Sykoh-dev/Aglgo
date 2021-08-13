import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        // exo10-Calculatrice
        // Réaliser l’algorithme d’une calculatrice basique. L’utilisateur est invité à saisir
        // un nombre, un opérateur, et un deuxième nombre. La calculatrice affiche
        // ensuite le résultat. (Gérer la division par 0)
        int i = 0;
        double nb1, nb2, resultat = 0.0;
        char operateur;
        double [] tabHistorique = new double[10];

        System.out.println("Entrez un premier nombre");
        Scanner sc = new Scanner(System.in);
        nb1 = Double.parseDouble(sc.nextLine());

        System.out.println("Entrez un operateur");
        operateur = sc.nextLine().charAt(0);

        System.out.println("Entrez un deuxième nombre");
        nb2 = Double.parseDouble(sc.nextLine());

        if ((operateur == '+' )  || (operateur == '-') || (operateur == '*') || (operateur == '/'))
        {
            switch (operateur)
            {
                case ('+') :
                    resultat = nb1 + nb2;
                    break;
                case ('-') :
                    resultat = nb1 - nb2;
                    break;
                case ('*') :
                    resultat = nb1 * nb2;
                    break;
                case ('/') :
                    if (nb2 != 0)
                    {
                        resultat = nb1 / nb2;
                    }
                    else
                    {
                        System.out.println("Division par 0 impossible");
                    }
                    break;


            }
            if ((!(operateur == ('/')) || !(nb2 ==0)))
            {
                System.out.println(nb1 + " " + operateur + " " + nb2 + " = " + resultat);
            }
            tabHistorique[i] = resultat;
            i++;
            for ( int j=0 ; j < tabHistorique.length; j++){
                System.out.println(tabHistorique[j]);
            }
        }
        else
        {
            System.out.println("Opérateur non reconnu");
        }
    }
}
