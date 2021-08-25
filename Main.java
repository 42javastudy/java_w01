import packages.first.ArithmeticOperation;
import packages.first.MyName;
import packages.first.Student;
import packages.first.ExDisplay;
import packages.first.Human;
public class Main {
    public static void main(String[] args){
        new ExDisplay(1);
        new MyName();
        new ExDisplay(2);
        ArithmeticOperation operation = new ArithmeticOperation(1,0);
        System.out.println("add " + operation.add());
        System.out.println("sub " + operation.sub());
        System.out.println("mul " + operation.mul());
        System.out.println("div " + operation.div());
        new ExDisplay(3);
        Student student = new Student(1, "이기영", 1);
        new ExDisplay(4);
        System.out.println(student);
        new ExDisplay(5);
        System.out.println(new Human().nameGetter());
        System.out.println(new Human("제인").nameGetter());
        Human human = new Human("철수");
    }
}