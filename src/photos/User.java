package photos;

import java.io.Serializable;

public class User implements Serializable{
    private String username;

    public User(String name){
        username = name;
    }

    public String getUsername(){
        return username;
    }
    
}
