package photos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Photo implements Serializable{

    //tags
    //looks like hashmap key value pairs
    //add custom tag type list later
    private Map<String, ArrayList<String>> tag = new HashMap<>();

    //date serializable

    // stock in workspace, user not
    // >5 < 10 stock photos
    //username 'stock' pass=stock, album stock

    //caption
    private String caption = "";

    public Photo(){
        

    }

}