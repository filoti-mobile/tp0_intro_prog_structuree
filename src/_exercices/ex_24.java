import static java.lang.IO.print;
import static java.lang.IO.println;

void main() {
 /* Écrivez un programme qui demande trois valeurs entières en une seule saisie et qui affiche
leur moyenne.*/

    Scanner scanner = new Scanner(System.in);
    print("Entrez trois valeurs :");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    double moyenne = (double) (a + b + c) / 3;
    println("La moyenne est " + moyenne);
    String formatted = String.format("%,.2f", moyenne);
    // bonus: format moyenne
    print("La moyenne formattée est " +  formatted);



}
