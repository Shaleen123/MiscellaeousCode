import java.util.function.Predicate;

public class FunctionalClassImplementation implements MyFunctioanlInterface, MyFunctionalInterface2, Predicate {
    @Override
    public void display(int x) {
    }

    public void show() {
        MyFunctioanlInterface.super.show();
        MyFunctionalInterface2.super.show();
    }

    public static void main(String[] args) {
     /*   MyFunctioanlInterface myFunctioanlInterface = (x) -> {
            System.out.println(x);
        };IndividualDetailImpl
        myFunctioanlInterface.show();*/


        FunctionalClassImplementation functionalClassImplementation = new FunctionalClassImplementation();

        functionalClassImplementation.display(100);

        functionalClassImplementation.show();
        functionalClassImplementation.test(null);
        MyFunctioanlInterface.print();


    }

    @Override
    public boolean test(Object o) {
        System.out.println("Inside oredicate implementation");
        return true;
    }
}