package factory;
/*
 类1 ------- 接口1 ----  工厂 --根据参数返回 ---实例1
 类2 ____|                                |__ 实例2
 类3 ____|                                |__ 实例3
 ......                                  .......

 工厂方法返回类型是个接口

 */


public class test {
    public static void main(String args[]){
        factorymethod fm=new factorymethod();
        pi pp1=fm.getpi("p1");
        pi pp2=fm.getpi("p2");

        pp1.product();
        pp2.product();

    }
}
