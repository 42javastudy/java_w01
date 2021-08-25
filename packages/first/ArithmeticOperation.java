package packages.first;

public class ArithmeticOperation {
    private int num1=0;
    private int num2=0;
    public ArithmeticOperation (int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add(){
        return this.num1 + this.num2;
    }
    public int sub(){
        return this.num1 - this.num2;
    }
    public int mul(){
        return this.num1 * this.num2;
    }
    public int div() {
        try {
            return this.num1 / this.num2;
        }catch (Exception e){
            System.err.println("ex02 div ERROR :"+e);
            return 0;
        }
    }
}
