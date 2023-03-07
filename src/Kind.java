public class Kind {
    public String name;
    public String geschlecht;
    public int alter;

    public Kind(String neuerName, String neuesGeschlecht, int neuesAlter) {
        name = neuerName;
        geschlecht = neuesGeschlecht;
        alter = neuesAlter;
    }

    public void spielen() {
        System.out.println(name + ", " +  geschlecht + ", " + alter + " Jahre spielt");
    }

    public void schläft() {
        System.out.println(name + ", " + geschlecht + ", " + alter + " Jahre schläft");
    }
}
