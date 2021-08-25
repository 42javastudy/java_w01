package packages.first;

public class ExDisplay {
    public ExDisplay(int ex){
        System.out.print("--------------------");
        String res = ex < 10 ? "0" + ex : "" + ex;
        System.out.print("ex"+res);
        System.out.println("--------------------");
    }
}
