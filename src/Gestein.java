public class Gestein {
    public String name;
    public double dichte;
    public String hauptmineral;
    public String nebenmineral;

    public Gestein(String neuerName, double neueDichte,
                   String neuesHauptmineral, String neuesNebenmineral) {
        name = neuerName;
        dichte = neueDichte;
        hauptmineral = neuesHauptmineral;
        nebenmineral = neuesNebenmineral;
        System.out.println("Gestein erzeugt"); // <- Mhmmm
    }

    public void werfen() {
        System.out.println(name + " fliegt");
    }

    public void zerbröseln() {
        System.out.println(name + " wird in " + hauptmineral +
                " und " + nebenmineral + " zerteilt");
    }

    public void untersuchen() {
        System.out.println(name + " besteht aus " + hauptmineral +
                " und " + nebenmineral);
    }
}
