/* Écrivez un programme qui demande une valeur réelle et qui l'affiche avec au moins 5
chiffres après la virgule, en forçant l'apparition du signe et en incluant le groupement de
chiffres.*/

import static java.lang.IO.println;

void main() {
    Scanner scanner = new Scanner(System.in);
    println("Entrez une valeur réelle: ");
    float a = scanner.nextFloat();
    String aFormatee = String.format("%+,.5f", a);

    println("La valeur formatée est: " + aFormatee);
}