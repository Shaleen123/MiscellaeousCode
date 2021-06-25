public interface MyFunctioanlInterface {

    public void display(int x);

    default void show() {
        System.out.println("Hello from interface 1");
    }

    static void print() {
        System.out.println("Hello baby");
    }

}
