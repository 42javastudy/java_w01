package packages.first;

public class Student{
    public String studentname;

    public String getName(){
        return studentname;
    }

    public static void main(String[] args){
        Student s = new Student();
        System.out.println(s.getName());
    }
}
