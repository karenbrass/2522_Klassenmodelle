public class Kind {
    public String name;
    public String geschlecht;
    public int alter;

    public Kind(String name, String geschlecht, int alter) {
        this.name = name;
        this.geschlecht = geschlecht;
        this.alter = alter;
    }

    public void spielen() {
        System.out.println(name + ", " +  geschlecht + ", " + alter + " Jahre spielt");
    }

    public void schläft() {
        System.out.println(name + ", " + geschlecht + ", " + alter + " Jahre schläft");
    }
}
