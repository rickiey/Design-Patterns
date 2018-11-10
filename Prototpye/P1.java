package Prototpye;

public class P1 implements Prototpye {
    public Prototpye clone(){
        return new P1();
    }
    public void print(){
        System.out.print("copy");
    }
}
