/* Écrivez un programme qui demande à l'utilisateur deux valeurs entières et qui affiche le
résultat de leur somme.*/

import static java.lang.IO.println;

void main() {
    Scanner scanner = new Scanner(System.in);
    println("Entrez une première valeur :");
    int a = scanner.nextInt();
    println("Entrez une seconde valeur :");
    int b = scanner.nextInt();
    int sum = a + b;
    println("La somme de " + a + " et " + b + " est " + sum);

}