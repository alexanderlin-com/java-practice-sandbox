package sandbox.constructordispatch;


public class Parent {
    int i = 1;

    Parent() {
        getI();
    }

    void getI() {
        System.out.println(i);
    }
}
