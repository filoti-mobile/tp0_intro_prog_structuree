import static java.lang.IO.print;
import static java.lang.IO.println;

void main() {
 /* Écrivez un programme qui demande deux valeurs entières et affiche le résultat de la division
entière, suivi du résultat de la division réelle.*/

    Scanner scanner = new Scanner(System.in);
    println("Entrez une première valeur :");
    int a = scanner.nextInt();
    println("Entrez une seconde valeur :");
    int b = scanner.nextInt();

    int divInt = a / b;
    double divDouble = (double) a / b;
    print("La division entière de " + a + " par " + b + " est: ");
    println(divInt);
    print("La division réelle de " + a + " par " + b + " est: ");
    println(divDouble);


}
