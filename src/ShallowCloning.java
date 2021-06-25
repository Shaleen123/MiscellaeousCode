/*
//object class clone method is a shallow cloning, if you need to implement deep cloning then override the clone method
Scenario 1 :cloneable interface
@author:Shaleen
 */
public class ShallowCloning implements Cloneable {

    int i = 10;
    int j = 10;
    CloningSubClass cloningSubClass;

    public ShallowCloning(CloningSubClass cloningSubClass) {
        this.cloningSubClass = cloningSubClass;
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        CloningSubClass cloningSubClass = new CloningSubClass();
        ShallowCloning originalObject = new ShallowCloning(cloningSubClass);
        ShallowCloning clonedObject = (ShallowCloning) originalObject.clone();

        /* printing hashcode after cloning(different hash codes) */
        System.out.println(originalObject.hashCode());
        System.out.println(clonedObject.hashCode());

        //changing cloned object
        clonedObject.i = 100;
        clonedObject.j = 200;
        clonedObject.cloningSubClass.m = 1000;

        System.out.println("originalObject" + originalObject.i);
        System.out.println("originalObject" + originalObject.j);
        System.out.println("originalObject" + originalObject.cloningSubClass.m);
        System.out.println("clonedObject" + clonedObject.i);
        System.out.println("clonedObject" + clonedObject.j);
        System.out.println("clonedObject" + clonedObject.cloningSubClass.m);
/**
 *    shallow cloning:It is also known as bitwise copy of an object.
 *          If the main object contains primitive variables, then exactly duplicate copies will be created in the cloned object
 *         If the main object contain any reference variable then corresponding object wont be created just a duplicate reference variable will be created
 *         pointing to old contained object.
 *
 */

    }
}
