package builder;

public class Client {
    public static void main(String[] args) {

        StudentBuilder studentBuilder=new StudentBuilder();

        Student student = null;
        try {
            student = studentBuilder.setName("praveen").setAddress("bangalore").build();

            System.out.println(student);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        }

        try {
            Student student2=new StudentBuilder().setRollNo(343434).build();
            System.out.println(student2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
