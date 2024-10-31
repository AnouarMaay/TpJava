public class AdditionCalculatrice {
    public static void main(String[] args) {
        // Vérification du nombre d'arguments
        if (args.length < 2) {
            System.out.println("Veuillez fournir deux nombres en arguments.");
            return;
        }

        // Conversion des arguments en nombres décimaux sans try et catch
        double nombre1 = Double.parseDouble(args[0]);
        double nombre2 = Double.parseDouble(args[1]);

        // Calcul de la somme
        double somme = nombre1 + nombre2;

        // Affichage du résultat
        System.out.println("La somme des deux nombres est : " + somme);
    }
}
