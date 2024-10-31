public class ConversionTemperature {
    public static void main(String[] args) {
        // Vérification de la présence d'un argument
        if (args.length < 1) {
            System.out.println("Veuillez fournir une température en degrés Celsius en argument.");
            return;
        }

        // Conversion de l'argument en nombre décimal sans try et catch
        double celsius = Double.parseDouble(args[0]);

        // Affichage de la température entrée
        System.out.println("Température passée en argument en degrés Celsius : " + celsius);

        // Calcul de la conversion en Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Affichage du résultat en respectant le format souhaité
        System.out.println(celsius + " degrés Celsius équivalent à " + fahrenheit + " degrés Fahrenheit.");
    }
}
