import java.util.Scanner;

public class Exo02 {
    public static void main(String[] args) {

        String nom;
        String prenom;
        String message = "Bienvenue";


        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez votre nom");
        nom = sc.nextLine();
        System.out.println("Entrez votre prénom");
        prenom = sc.nextLine();


        System.out.println(message + " " + nom + " " + prenom);
    }
}
