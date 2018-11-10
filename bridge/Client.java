package bridge;

public class Client {
    public static void main(String args[]){
        AbstactBridge ab=new appendBridge();
        if1 ia=new if1A();
        ab.setif(ia);
        ab.append();
        ((appendBridge) ab).if1A.get();

    }
}
