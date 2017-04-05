/**
 * Created by maskac on 4/3/2017.
 */

import org.apache.log4j.Logger;
import student.TestCase;

public class StudentTest
        extends TestCase {
    public static Logger log = Logger.getLogger(Student.class.getName());
    private Student s1;
    private Student s2;
    public void setUp() {
        s1 = new Student("Max", 123-4567);
        s2 = new Student( "Ingrid", 145-765, "5186453425", "110 8th Street", 25, "Computer Science");
        log.info("Initialization of s1 and s2 complete");
    }

    // this is to test github via IntelliJ

    public void testSetName()
    {
        s1.setName("Ingrid");
        log.warn("Warn Message! " + s1.getName());
        assertEquals(s1.getName(), "Ingrid");
    }

    public void testSetId()
    {
        s1.setId(123-8888);
        try{
            int data = 50/0;
        } catch(ArithmeticException ex) {
            log.error("This is an error message!", ex);
        }
        assertEquals(s1.getId(),123-8888);
    }

    public void testSetAge()
    {
        s2.setAge(34);
        log.fatal("This is a fatal message!");
        assertEquals(s2.getAge(), 34);
    }
}
