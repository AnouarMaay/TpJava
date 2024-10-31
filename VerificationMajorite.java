public class VerificationMajorite {
    public static void main(String[] args) {
        // Vérification de la présence d'un argument
        if (args.length < 1) {
            System.out.println("Veuillez fournir votre âge en argument.");
            return;
        }

        // Conversion de l'argument en entier
        int age = Integer.parseInt(args[0]);

        // Affichage de l'âge
        System.out.println("Âge passé en argument : " + age);

        // Vérification de la majorité
        if (age >= 18) {
            System.out.println("Vous êtes majeur.");
        } else {
            System.out.println("Vous êtes mineur.");
        }
    }
}
