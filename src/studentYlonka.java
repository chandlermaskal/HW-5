/**
 * Created by ylonka on 4/5/17.
 */
/*Abstraction, Abstract class, and Access modifiers*/
public abstract class studentYlonka implements member {
    protected String name;
    private int rin;
    public int year;

    public String getName() {
        return this.name;
    }

    public int getRin() {
        return this.rin;
    }

    public int getYear() { return this.year; }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setRin(int newRin) {
        this.rin = newRin;
    }

}

/*Inheritance & Polymorphism*/
class senior extends studentYlonka {

    private String concentration;

    public senior() {
         super.year = 4;
    }

    public String getConc() {
        return this.concentration;
    }

    public void setConc(String newConc) {
        this.concentration = newConc;
    }
}

class freshman extends studentYlonka {
    public String mentor;

    public freshman() {
        super.year = 1;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public String getMentor() {
        return this.mentor;
    }
}
