/**
 * Created by ylonka on 4/5/17.
 */
/*Encapsulation*/
public class studentTestYlonka {

    public static void main(String args[]) {
        senior Senior = new senior();
        Senior.setName("Ylonka");
        Senior.setRin(1234567);
        Senior.setConc("MIS");
        Senior.getYear();

        /*Polymorphism*/
        studentYlonka Freshman = new freshman();
        Freshman.setName("Max");
        Freshman.setRin(1234566);
        Freshman.getYear();
        /*Cannot set concentration because this class derives from student, not senior*/

        /*Polymorphism cont. all objects have different predetermined values as Year*/
        studentYlonka[] students = { new senior(), new freshman()};
        for (studentYlonka x : students)
        {
            System.out.print(x.getYear() + "\n");
        }

        System.out.print("Name: " + Senior.getName() + " RIN: " + Senior.getRin() + " Concentration: " + Senior.getConc() + " Year: " + Senior.getYear());
        System.out.print("\nName: " + Freshman.getName() + " RIN: " + Freshman.getRin() + " Year: " + Freshman.getYear());
    }
}
