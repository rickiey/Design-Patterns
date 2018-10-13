package factory;

public class factorymethod {

    public pi getpi(String piname){
        if(piname.equals("p1")){
            return new p1();
        }else if(piname.equals("p2")){
            return new p2();
        }else {
            return null;
        }
    }
}
