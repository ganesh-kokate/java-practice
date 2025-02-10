import java.util.Scanner;

class EVM {
    public static void main(String[] args) {
        System.out.println("        Welcome");
        Scanner sc = new Scanner(System.in);
        int bjp = 0, cng = 0, mns = 0, aap = 0, ss = 0, nota = 0;

        System.out.println();
        System.out.println(" Enter The population");
        int population = sc.nextInt();

        for (int i = 0; i < population; i++) {
            System.out.println();
            System.out.println("----- List of Parties ----------");
            System.out.println("1.BJP");
            System.out.println("2.Congress");
            System.out.println("3.ShivSena");
            System.out.println("4.MNS");
            System.out.println("5.AAP");
            System.out.println("6.NOTA");
            System.out.println("");
            System.out.println("Enter Option");

            int opt = sc.nextInt();

            if (opt >= 1 && opt <= 6) {
                if (opt == 1) {
                    bjp++;
                    System.out.println("Achhe Din ayenge");
                }
                if (opt == 2) {
                    cng++;
                    System.out.println("Bharat Jodo");
                }
                if (opt == 3) {
                    ss++;
                    System.out.println("Hum Hai Asli Sena");
                }
                if (opt == 4) {
                    mns++;
                    System.out.println("Jai Maharashtra");
                }
                if (opt == 5) {
                    aap++;
                    System.out.println("Muze Ajad Karo");
                }

                if (opt == 6) {
                    nota++;
                    System.out.println("Educated");
                }
                if (!(opt >= 1 && opt <= 6)) {
                    i--;
                    System.out.println("Invalid");
                }

            }

            if (bjp >= cng && bjp >= ss && bjp >= aap && bjp >= mns && bjp >= nota) {
                System.out.println("BJP Wins with " + bjp + "votes");
                return;
            }
            if (cng >= bjp && cng >= ss && cng >= aap && cng >= mns && bjp >= nota) {
                System.out.println("CNG Wins with " + cng + "votes");
            }
            if (aap >= bjp && aap >= ss && aap >= cng && aap >= mns && aap >= nota) {
                System.out.println("AAP Wins with " + aap + "votes");
            }
            if (mns >= cng && mns >= ss && mns >= aap && mns >= bjp && mns >= nota) {
                System.out.println("MNS Wins with " + mns + "votes");
            }
            if (ss >= cng && ss >= bjp && ss >= aap && ss >= mns && ss >= nota) {
                System.out.println("ShivSena Wins with " + ss + "votes");
            }

        }
    }
}