package photos;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable{
    private String username;
    private ArrayList<Album> albums;

    public User(String name){
        username = name;
    }

    public String getUsername(){
        return username;
    }

    //create albums
    public void createAlbum(){
        albums.add(new Album());
    }

    //delete albums
    public void deleteAlbum(Album album){
        albums.remove(album);

    }

    //rename albums
    public void renameAlbum(){

    }
    
    //open album

    //search for photos

    //logout
    
}
