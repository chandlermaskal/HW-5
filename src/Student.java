/**
 * Created by maskac on 4/3/2017.
 */

public class Student {
    private String name; //students first name
    private int id; //student ID number
    private String phone; //student phone number
    private String address;
    private int age; //student age
    private String department; //student academic department


    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Student(String name, int id, String phone, String address, int age, String department) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected String getPhone() {
        return phone;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    String getAddress() {
        return address;
    }

    void setAddress(String address) {
        this.address = address;
    }

    public void printStudentInfo() {
        System.out.println("hi " + getName() + " your id is " + getId() + " your phone number is " + getPhone() + " your age is " + getAge() + " and your department is " + getDepartment());
    }


}