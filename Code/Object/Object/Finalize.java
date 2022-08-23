package Object;

public class Finalize {
    public static void main(String[] args) {
        Car car = new Car("car");
        car = null; // 这时候car就变成垃圾了， 垃圾回收器自动回收（销毁）对象
        // 销毁对象的时候就会调用finalize方法
        // 那么我们就可以在finalize中写自己的业务逻辑代码
        System.gc(); // 强制叫出来gc
    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Work done");
    }
}