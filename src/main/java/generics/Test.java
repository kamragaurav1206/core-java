package generics;

public class Test<T> {
    T t;

    Test(T t){
        this.t = t;
    }

    public void printClassType(){
        System.out.println(this.t.getClass());
    }

    public void print(){
        System.out.println("Value is : "+t);
    }
}
