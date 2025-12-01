/* Écrivez un programme qui demande le nom d'un fichier et une phrase, puis écrit cette
phrase dans le fichier.*/

import static java.lang.IO.println;

void main() throws IOException {

    Scanner scanner = new Scanner(System.in);
    println("Entrez le nom d'un fichier: ");
    String fileName = scanner.nextLine();

    try (FileWriter fw = new FileWriter(fileName)) {
        fw.write("Ceci est un test");
    } finally {
        println("Close always executed");
        // always executed
    }
}