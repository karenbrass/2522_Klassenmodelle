public class Gestein {
    public String name;
    public double dichte;
    public String hauptmineral;
    public String nebenmineral;

    public Gestein(String name, double dichte, String hauptmineral, String nebenmineral) {
        this.name = name;
        this.dichte = dichte;
        this.hauptmineral = hauptmineral;
        this.nebenmineral = nebenmineral;
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
