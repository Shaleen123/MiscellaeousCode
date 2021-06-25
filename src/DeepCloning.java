public class DeepCloning implements Cloneable {
    int x = 10;
    int y = 20;
    DeepCloningSubClass deepCloningSubClass;

    public DeepCloning(DeepCloningSubClass deepCloningSubClass) {
        this.deepCloningSubClass = deepCloningSubClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCloning deepCloning = (DeepCloning) super.clone();
        deepCloning.deepCloningSubClass = (DeepCloningSubClass) deepCloningSubClass.clone();
        return deepCloning;

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCloningSubClass deepCloningSubClass = new DeepCloningSubClass();
        DeepCloning originalObject = new DeepCloning(deepCloningSubClass);
        DeepCloning clonedObject = (DeepCloning) originalObject.clone();

        /* printing hashcode after cloning(different hash codes) */
        System.out.println(originalObject.hashCode());
        System.out.println(clonedObject.hashCode());

        System.out.println("original object");

        System.out.println("originalObject" + originalObject.x);
        System.out.println("originalObject" + originalObject.y);
        System.out.println("originalObject" + originalObject.deepCloningSubClass.z);

        System.out.println("clone of original object");
        //cloned object before modification
        System.out.println("clonedObject" + clonedObject.x);
        System.out.println("clonedObject" + clonedObject.y);
        System.out.println("clonedObject" + clonedObject.deepCloningSubClass.z);

        //changing cloned object
        clonedObject.x = 100;
        clonedObject.y = 200;
        clonedObject.deepCloningSubClass.z = 500;

        System.out.println("cloned object after modification");
        System.out.println("clonedObject" + clonedObject.x);
        System.out.println("clonedObject" + clonedObject.y);
        System.out.println("clonedObject" + clonedObject.deepCloningSubClass.z);

        System.out.println("original object remains same");
        System.out.println("originalObject" + originalObject.x);
        System.out.println("originalObject" + originalObject.y);
        System.out.println("originalObject" + originalObject.deepCloningSubClass.z);


    }
}
