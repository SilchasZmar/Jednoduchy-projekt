package cz.itnetwork;

public class Pojistenec {

    private String jmeno;
    private String prijmeni;
    private int telefoniCislo;
    private int vek;

    public Pojistenec(String jmeno, String prijmeni, int telefoniCislo, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefoniCislo = telefoniCislo;
        this.vek = vek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    @Override
    public String toString() {
        return "Pojištěný/á - " + jmeno + " " + prijmeni + "\n" + "Telefonní číslo - " + telefoniCislo + "\n" + "Věk - " + vek;
    }
}
