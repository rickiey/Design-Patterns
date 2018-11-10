package Prototpye;

public class client {
    private Prototpye p;
    public client(Prototpye a){
        this.p=a;

    }
    public static void main(String args[]){

        client c=new client(new P1());
        c.p.print();

    }
}
