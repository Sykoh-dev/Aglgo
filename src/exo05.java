import java.util.Scanner;

public class exo05 {
    public static void main(String[] args) {
        int secondesAConvertir, secondes, minutes, heures, jours;

        System.out.println("Entrez un nombre de secondes à convertir : ");


        Scanner sc = new Scanner(System.in);
        secondesAConvertir =Integer.parseInt(sc.nextLine());


        jours = secondesAConvertir / 86400;
        heures = (secondesAConvertir % 86400) / 3600;
        minutes = ((secondesAConvertir % 86400) % 3600) / 60;
        secondes = ((secondesAConvertir % 86400) % 3600) % 60;

        System.out.println(secondesAConvertir + " secondes correspondent à " + jours + " jour(s) " + heures + " heure(s) " + minutes + " minute(s) " + secondes + " seconde(s)");
    }
}