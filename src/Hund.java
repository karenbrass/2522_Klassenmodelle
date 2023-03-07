public class Hund {
    public String rasse;
    public double alter;
    public String farbe;

    public Hund(String rasse, double alter, String farbe) {
        // Neues Schlüsselwort: Zugriff auf das eigenen Objekt: this (self, me)
        this.rasse = rasse;
        this.alter = alter;
        this.farbe = farbe;
    }

    public void adoptieren() {
        System.out.println("Der " + farbe + " " + rasse + " mit " + alter + " Jahre wurde adopiert" );
    }

    public void trickBeibringen(String trick) {
        System.out.println("Der " + farbe + " " + rasse + " mit " + alter + " Jahre hat den Trick \"" +
                 trick + "\" gelernt");
    }
}
