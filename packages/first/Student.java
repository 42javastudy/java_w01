package packages.first;

public class Student {
    private String id = "학번 : ";
    private String name = "이름 : ";
    private String grade = "학년 : ";
    public Student(int id, String name, int grade){
        System.out.println(this.id = this.id + id);
        System.out.println(this.name = this.name + name);
        System.out.println(this.grade = this.grade + grade + "학년");
    }
}
