public class Gericht {
    public String name;
    public String zutaten;
    public double preis;

    public Gericht(String neuerName, String neueZutaten, double neuerPreis) {
        name = neuerName;
        zutaten = neueZutaten;
        preis = neuerPreis;
    }

    public void zutatHinzufügen(String zutat) {
        System.out.println("Zutat " + zutat + " wurde hinzugefügt");
        zutaten = zutaten + ", " + zutat;
    }

    public void kochen() {
        System.out.println("Aus den Zutaten " + zutaten + " entsteht " + name);
    }
}
