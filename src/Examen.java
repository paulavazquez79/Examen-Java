import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int op;

        String[][] reserves = {
                { "Nom1", "telèfon1", "prepararTaula1", "comentari1" },
                { "Nom2", "telèfon2", "prepararTaula2", "comentari2" },
                { "Nom3", "telèfon3", "prepararTaula3", "comentari3" }
        };

        String[][] arrayOP;

        do {
            System.out.println("1. Afegir reserva");
            System.out.println("2. Tancar reserva");
            System.out.println("3. Llistar reserves actives i tancades");
            System.out.println("4. Llistar reserves de clients");
            switch (op) {
                case 1: // Afegir reserva
                    arrayOP = new String[reserves.length + 1][reserves[0].length];
                    for (int i = 0; i < reserves.length; i++) {
                        for (int j = 0; j < reserves[i].length; j++) {
                            arrayOP[i][j] = reserves[i][j];
                        }
                    }
                    System.out.println("Quin és el teu nom?");
                    arrayOP[arrayOP.length - 1][1] = lector.nextLine();
                    System.out.println("Quin és el teu telèfon?");
                    arrayOP[arrayOP.length - 1][2] = lector.nextLine();
                    break;
                case 2: // Tancar reserva
                    break;
                case 3: // Llistar reserves actives i tancades
                    break;
                case 4: // Llistar reserves de clients
                    break;

                default:
                    break;
            }
        }while(op != 0);
        lector.close();
    }
}
