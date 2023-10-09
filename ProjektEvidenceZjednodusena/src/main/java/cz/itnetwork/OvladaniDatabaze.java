package cz.itnetwork;

import java.util.Scanner;

public class OvladaniDatabaze {

    private DatabazePojistencu databazePojistencu;
    private Scanner scanner = new Scanner(System.in, "UTF-8");

    public OvladaniDatabaze() {
        databazePojistencu = new DatabazePojistencu();
    }

    public void spustitMenu() {
        boolean pokracovat = true;

        while (pokracovat) {
            System.out.println("Zvolte akci\n-----------");
            System.out.println("1 - Přidat pojištěnce");
            System.out.println("2 - Zobrazit všechny pojištěnce");
            System.out.println("3 - Hledat pojištěnce");
            System.out.println("4 - Konec");
            System.out.println();

            String volba = scanner.nextLine();

            switch (volba) {
                case "1":
                    pridatPojistence();
                    break;
                case "2":
                    zobrazitVsechnyPojistence();
                    break;
                case "3":
                    hledatPojistence();
                    break;
                case "4":
                    pokracovat = false;
                    break;
                default:
                    System.out.println("Neplatná volba. Zkuste to znovu.");
                    break;
            }
            if (pokracovat) {
                System.out.println("Pokračovat můžete stisknutím entru. Pokud nechcete pokračovat zadejte NE.");
                String odpoved = scanner.nextLine().trim().toLowerCase();
                if (odpoved.equals("ne")) {
                    pokracovat = false;
                }
            }
        }
    }

    private void pridatPojistence() {
        System.out.println("Zadejte jméno:");
        String jmeno = scanner.nextLine().trim();

        System.out.println("Zadejte příjmení:");
        String prijmeni = scanner.nextLine().trim();

        System.out.println("Zadejte telefonní číslo:");
        int telefonniCislo = Integer.parseInt(scanner.nextLine().trim());

        System.out.println("Zadejte věk:");
        int vek = Integer.parseInt(scanner.nextLine().trim());

        databazePojistencu.pridatPojistence(jmeno, prijmeni, telefonniCislo, vek);
        System.out.println("Pojištěnec přidán do databáze.");
    }

    private void zobrazitVsechnyPojistence() {
        databazePojistencu.vypisPojistencu();
    }

    private void hledatPojistence() {
        System.out.println("Zadejte jméno:");
        String jmeno = scanner.nextLine().trim();

        System.out.println("Zadejte příjmení:");
        String prijmeni = scanner.nextLine().trim();

        Pojistenec nalezenyPojistenec = databazePojistencu.najitPojistence(jmeno, prijmeni);

        if (nalezenyPojistenec != null) {
            System.out.println("Nalezený pojištěnec: \n-------------------\n" + nalezenyPojistenec);
        } else {
            System.out.println("Pojištěnec nenalezen.");
        }
    }
}