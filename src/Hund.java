public class Hund {
    public String rasse;
    public double alter;
    public String farbe;

    public Hund(String neueRasse, double neuesAlter, String neueFarbe) {
        rasse = neueRasse;
        alter = neuesAlter;
        farbe = neueFarbe;
    }

    public void adoptieren() {
        System.out.println("Der " + farbe + " " + rasse + " mit " + alter + " Jahre wurde adopiert" );
    }

    public void trickBeibringen(String trick) {
        System.out.println("Der " + farbe + " " + rasse + " mit " + alter + " Jahre hat den Trick \"" +
                 trick + "\" gelernt");
    }
}
