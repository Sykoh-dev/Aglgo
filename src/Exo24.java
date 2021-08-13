import java.util.Scanner;
public class Exo24 {
    public static void main(String[] args) {
        //exo24-Écrire un algorithme demandant à l’utilisateur le nombre de joueurs
        //(max 10 joueurs). Ensuite, l’algorithme doit demander à l’utilisateur
        //le score de chaque joueur. Une fois ceci fini, il faut afficher la moyenne des scores.

        int i;
        double somme, joueur;
        final int MAX_JOUEUR = 10;
        Double[] scoreJoueur = new Double[MAX_JOUEUR];

        i = 0;
        somme = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien y a t'il de joueur");
        joueur = Integer.parseInt(sc.nextLine());
        System.out.println("Veuillez entrer le score de chaque joueur");


        while ( i < (joueur)  )
        {
            scoreJoueur[i] = Double.parseDouble(sc.nextLine());
            somme = somme + (scoreJoueur[i]);
            System.out.println(scoreJoueur[i]);
            i++;
        }


        System.out.println("La moyenne des scores est" + " " + (somme/joueur));
    }
}
