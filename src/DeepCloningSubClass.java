public class DeepCloningSubClass implements Cloneable {
    int z = 20;
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
