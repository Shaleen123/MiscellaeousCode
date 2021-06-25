import java.util.ArrayList;
import java.util.List;

public class CollectionsImmutablity {
    final private String name;
    final private String id;

    MutableCollection mutableCollection;
    List arraylist;

    public CollectionsImmutablity(String name, String id, MutableCollection mutableCollection) {
        this.name = name;
        this.id = id;
        this.arraylist = mutableCollection.getAl();
    }


}
