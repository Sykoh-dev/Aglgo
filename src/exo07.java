import java.util.Scanner;

public class exo07 {
    public static void main(String[] args) {
        //Déclaration
        int annee;
        // Demander à l'utilisateur une année
        System.out.println("Introduisez l'année");


        Scanner sc = new Scanner(System.in);
        annee = Integer.parseInt(sc.nextLine());

        // Traitement de la condition et affichage
        if (((annee % 4) == 0 && (annee % 100) != 0) || ((annee % 400) == 0))
        {
            System.out.println("L'année est Bisextille");
        }
        else
        {
            System.out.println("L'année n'est pas Bisextille");
        }
    }
}
