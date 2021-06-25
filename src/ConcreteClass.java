public class ConcreteClass extends AbstracteXAMPLE {

    public ConcreteClass(){
        super("a","b");
    }

    @Override
    public void display() {

    }

    public static void main(String[]args){
        ConcreteClass con = new ConcreteClass();

    }
}
