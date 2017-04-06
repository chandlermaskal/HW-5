/**
 * Created by ylonka on 4/5/17.
 */
/*Abstraction, Abstract class, and Access modifiers*/
public abstract class studentYlonka implements member {
    private String name;
    private int rin;
    private int year;

    public String getName() {
        return name;
    }

    public int getRin() {
        return rin;
    }

    public int getYear() {
        return year;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setRin(int newRin) {
        rin = newRin;
    }

}

/*Inheritance & Polymorphism*/
class senior extends studentYlonka {
    int year = 4;
    private String concentration;

    public int getYear() {
        return year;
    }

    public String getConc() {
        return concentration;
    }

    public void setConc(String newConc) {
        concentration = newConc;
    }
}

class freshman extends studentYlonka {
    int year = 1;

    public int getYear() {
        return year;
    }

}
