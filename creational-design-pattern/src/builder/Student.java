package builder;

import java.util.List;

public class Student {

    private String name;
    private int rollNo;
    private String address;
    private String email;

    public Student(StudentBuilder studentBuilder) throws Exception {
        if(studentBuilder.getName()==null){
            throw new Exception("Name is Mandatory");
        }
        else if(studentBuilder.getRollNo()==0){
            throw new Exception("Roll No is Mandatory...");
        }
        this.name=studentBuilder.getName();
        this.rollNo=studentBuilder.getRollNo();
        this.address=studentBuilder.getAddress();
        this.email=studentBuilder.getEmail();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
