public interface MyFunctionalInterface2 {

    public void display(int x);

    default void show() {
        System.out.println("Hello from interface 2");
    }

}
