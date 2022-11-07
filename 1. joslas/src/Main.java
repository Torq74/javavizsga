import java.util.Random;
import java.util.Scanner;
public class Main {

    public static String milyenEvVarhato(int hozam, int mennyiseg) {
        int ev = hozam/mennyiseg;
        String szoveg="";
        if (ev < 9) {
            szoveg = "átlag alatti";

        } else if ( ev > 12) {
            szoveg = "átlag feletti";

        } else {
            szoveg = "átlagos";

        }
        return szoveg;
    }
    public static void KiIras(String szoveg) {
        System.out.println("A hozam alapján "+szoveg+"  év vérható.");
    }
    public static int milyenHozamVarhato(int viszony, int buzaMennyiseg){
        int hozam=0;
        hozam = viszony*buzaMennyiseg;
        return hozam;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        int mennyiseg;
        input.useDelimiter("\n");
        do {
            int viszony = rnd.nextInt(10)+5;
            System.out.print("Adja meg az elvetett búza mennyiségét tonnában! ");
            try {
                mennyiseg = input.nextInt();
                if (mennyiseg == 0){
                    break;
                }
            } catch (Exception e) {

                    break;

            }
            int hozam = milyenHozamVarhato(viszony,mennyiseg);
            System.out.println("A várható hozam "+hozam+" tonna.");
            String szoveg = milyenEvVarhato(hozam,mennyiseg);
            KiIras(szoveg);
        } while (true);


        }

    }

