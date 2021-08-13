import java.util.Scanner;


public class pr1 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";


    public static void main(String[] args) {

        // Déclaration
        int age=0;
        String nom, prenom, mention, monsieur = "mr", madame = "mme";
        char sexe, masculin='m';
        boolean continuer=false;
        Scanner sc = new Scanner(System.in);

        //Affectation par demande à l'utilisateur

        System.out.println("Entrez votre nom");
        nom = sc.nextLine();


        System.out.println("Entrez votre prénom");
        prenom = sc.nextLine();

        char initial = prenom.charAt(0);

        System.out.println("Entrez votre age");
        //Vérification d'un age
        while (age > 0 || age < 103){
            System.out.println("Erreur d'entrée, veuillez choisir un age correct!");
        }
        age = Integer.parseInt(sc.nextLine());

        System.out.println("Entrez votre sexe (m/f)");
        sexe = sc.nextLine().charAt(0);
        //Vérification de m ou f
        while ((sexe != 'm') && (sexe != 'f'))
        {
            System.out.println("Erreur d'entrée, veuillez choisir entre m ou f!");
            sexe = sc.nextLine().charAt(0);
        }

        //Condition pour choix de Monsieur ou Madame
        if ( sexe == masculin){
            mention = monsieur;
        }
        else {
            mention = madame;
        }

        //Affichage
        System.out.println("Bonjour" + " " + mention + " " + initial + " " + nom);

        //Condition si <= 12 ou si >12
        if (age <= 12){
            System.out.println(ANSI_RED +"Vous n'êtes pas autorisé"+ ANSI_RESET);
        }
        else {
            System.out.println(ANSI_GREEN +"Bienvenue sur notre boutique"+ ANSI_RESET);
        }








    }
}
