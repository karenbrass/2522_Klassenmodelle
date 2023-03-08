public class Kind {
    private String name;
    private String geschlecht;
    private int alter;

    public Kind(String name, String geschlecht, int alter) {
        this.name = name;
        this.geschlecht = geschlecht;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public String getGeschlecht () {
        return geschlecht;
    }

    public int getAlter () {
        return alter;
    }

    public void setAlter (int alter) {
        this.alter = alter;
    }

    public void spielen() {
        System.out.println(name + ", " +  geschlecht + ", " + alter + " Jahre spielt");
    }

    public void schläft() {
        System.out.println(name + ", " + geschlecht + ", " + alter + " Jahre schläft");
    }
}
