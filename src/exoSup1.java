import java.util.Scanner;

public class exoSup1 {
    public static void main(String[] args) {
        //1) Réalisez un système de connexion à l'aide d'un
        //mot de passe. L'algorithme demande à l'utilisateur
        //de saisir son mot de passe. Si ce dernier valide de
        //bon mot de passe, on le salue. Par contre, si il fait
        //une erreur trois fois de suite, un message lui signalera
        //que son compte est bloqué et il ne pourra pas réessayer
        //une quatrième fois

        //Déclaration
        int motDePasse, mdp, essai;
        Scanner sc = new Scanner(System.in);

        //Affectation
        mdp = 123;
        essai = 1;

        System.out.println("Veuillez entrer votre mot de passe");
        motDePasse = Integer.parseInt(sc.nextLine());

        //Boucle si le mot de passe est correct ou non
        while ( motDePasse != mdp && essai !=3 )
        {
            //Affichage message d'erreur de mot de passe jusqu'à 3 essai
            do
            {
                System.out.println("Erreur veuillez entrer votre mot de passe à nouveau");
                motDePasse = Integer.parseInt(sc.nextLine());
                essai = essai + 1;
            }
            while ( essai != 3 );
        }
        //Bloqué ou bienvenue
        if ( motDePasse != mdp )
        {
            System.out.println("Vous êtes bloqués");
        }
        else
        {
            System.out.println("Bienvenue utilisateur");
        }
    }
}
