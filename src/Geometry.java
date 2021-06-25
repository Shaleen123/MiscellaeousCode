public class Geometry {
    public int calculateArea(Rectangle r) {
       return r.area(3);
    }

    public void display(Object a){
        System.out.println("Inside method 1");

    }

    public void display(String a){
        System.out.println("Inside method 2");

    }
    public static void main(String[]args){

        Geometry gmy = new Geometry();
      System.out.println(gmy.calculateArea(new Square()));

        gmy.display(null);

        int i = 1;
        while (i < 10)
            if ((i++) % 2 == 0)
                System.out.println(i);

    }
}
