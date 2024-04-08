package builder;

public class StudentBuilder {


    private String name;
    private int rollNo;
    private String address;
    private String email;


    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public StudentBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
    public Student build() throws Exception {
        return new Student(this);
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
