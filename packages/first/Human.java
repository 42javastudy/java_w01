package packages.first;

public class Human {
    private String name;
    public Human(){
        this("노트");
    }
    public Human(String name){
        this.name = name;
        System.out.println("이름은 " + name + "이고 나이는 30살 입니다.");
        System.out.println("성별은 여성이며, 기혼자 입니다. 자녀는 1명이 있습니다.");
    }
    public String nameSetter(String name){
        this.name = name;
        return nameGetter();
    }
    public String nameGetter(){
        return this.name;
    }
}
