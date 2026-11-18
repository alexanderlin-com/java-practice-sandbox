package sandbox.constructordispatch;

public class Child extends Parent {
    int i = 2;

    Child() {
        getI();
    }

    void getI() {
        System.out.println(i);
    }
}
