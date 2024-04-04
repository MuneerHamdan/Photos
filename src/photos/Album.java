package photos;
import java.util.ArrayList;

public class Album {

    private ArrayList<Photo> photos;
    private String name;

    public Album(){
        photos = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void rename(String newName){
        name = newName;
    }
    
}
