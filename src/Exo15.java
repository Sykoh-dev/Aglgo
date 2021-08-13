public class Exo15 {
    public static void main(String[] args) {
        // exo15-À l’aide de deux boucles, affichez les tables de
        // multiplication de 1 à 9.

        //Déclaration
        int table, nombre, resultat;

        //Affectation
        table = 1;

        while ( table <= 9 )
        {
            System.out.println("Table de multiplication de " + table);
            nombre = 1;

            while ( nombre <= 10 )
            {
                resultat = nombre * table;
                System.out.println(nombre + " * " + table + " = " + resultat);
                nombre = nombre + 1;
            }
            table = table + 1;
        }
    }
}
