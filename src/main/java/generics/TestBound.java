package generics;

public class TestBound<T extends Number> {
    T t;

    TestBound(T t){
        this.t = t;
    }

    public void print(){
        System.out.println(t);
    }


}
