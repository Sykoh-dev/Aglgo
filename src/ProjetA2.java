import java.util.Scanner;

public class ProjetA2 {
    public static void main(String[] args) {
        int nbElem = 4;
        int currentXPosition = 0, currentYPosition = 0;
        char input = 'a';

        // Tableau des répliques des collisions contre le mur
        String[] tabReplyHitWalls = {"Vous vous heurtez au mur.", "Vous vous heurtez à nouveau au mur.", "Peut-être devriez-vous changer de lunettes..", "Qu'est-ce que vous ne comprenez pas dans \"Vous vous heurtez contre le mur ?\""};

        // INITIALISATION GRILLE
        int[][] tab = new int[nbElem][nbElem];
        Scanner sc = new Scanner(System.in);
        System.out.println("g. Aller à Gauche ⬅ | d. Aller à Droite ➡ | z. Aller en haut ⬆ | s. Aller en bas ⬇ | C. Quitter |");

        // IMPRESSION GRILLE
        int i = 0;
        for (int[] elem : tab) {
            int j = 0;
            for (int val : elem) {
                if (currentXPosition == i && currentYPosition == j)
                    System.out.print("[🧛‍]");
                else
                    System.out.print("[  ]");
                j++;

            }
            System.out.println("");
            i++;
        }

        input = sc.nextLine().charAt(0);

        // Tant que l'on a pas quitter (appuyer sur C)
        while (input != 'c') {
            switch (input) {
                case 'q' :
                    if(currentXPosition > 0) {
                        currentXPosition--;
                    } else {
                        System.out.println("Impossible d'aller vers la gauche, vous êtes déjà à la limite.");
                    }
                    break;
                case 'd' :
                    if(currentXPosition < tab.length-1) {
                        currentXPosition++;
                    } else {
                        System.out.println("Impossible d'aller vers la droite, vous êtes déjà à la limite.");
                    }
                    break;
                case 'z':
                    if(currentYPosition > 0) {
                        currentYPosition--;
                    } else {
                        System.out.println("Impossible d'aller vers le haut, vous êtes déjà à la limite.");
                    }
                    break;
                case 's':
                    if(currentYPosition < tab.length-1) {
                        currentYPosition++;
                    } else {
                        System.out.println("Impossible d'aller vers le bas, vous êtes déjà à la limite.");
                    }
                    break;
                default: System.out.println("Commande non reconnue.");
            }

            i = 0;
            for (int[] tab1D : tab) {
                int j = 0;
                for (int val : tab1D) {
                    if (currentXPosition == j && currentYPosition == i)
                        System.out.print("[🧛‍]");
                    else
                        System.out.print("[ ]");
                    j++;

                }
                System.out.println("");
                i++;
            }
            input = sc.nextLine().charAt(0);
        }
    }
}