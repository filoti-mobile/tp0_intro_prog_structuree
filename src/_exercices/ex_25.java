import static java.lang.IO.print;
import static java.lang.IO.println;

void main() {
    /* Écrivez un programme qui demande trois valeurs réelles et qui affiche leur valeur maximale.*/

    Scanner scanner = new Scanner(System.in);
    print("Entrez trois valeurs :");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    double max = Math.max(Math.max(a, b), c);
    println("La valeur maximale est " + max);




}
