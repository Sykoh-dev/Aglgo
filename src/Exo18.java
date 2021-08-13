import java.util.Scanner;

public class Exo18 {
    public static void main(String[] args) {
        // exo18-À l’aide d’une boucle Faire … TantQue, améliorez
        // l’algorithme de la calculatrice afin qu’elle demande à l’utilisateur
        // s’il veut faire un autre calcul (tant qu’il le désire).

        //Déclaration
        double nb1, nb2, resultat=0.0;
        char operateur;
        boolean calcul;

        do
        {
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
            }
            else
            {
                System.out.println("Opérateur non reconnu");
            }
            //Demande si l'utilisateur veux refaire un calcul
            System.out.println("Voulez vous faire un autre calcul? true/false");
            calcul = Boolean.parseBoolean(sc.nextLine());
        }

        while ( calcul );
    }
}
