package singletonpattern;
/*
单例模式

- 私有静态对象
- 私有构造方法
+ 公开提供这个对象的方法

类中的方法尽量是static
 */

//饿汉模式
public class sp {


    private static final sp  singletonpattern=new sp();
    private sp(){

    };
    public static sp getinstacne(){
        return singletonpattern;
    }
}


//懒汉模式
/*
public class sp {


    private static final sp  singletonpattern;
    private sp(){

    };
    public synchronized static sp getinstacne(){
        if(singletonpattern==null){
            singletonpattern=new sp();
        }
        return singletonpattern;
    }
}

*/
