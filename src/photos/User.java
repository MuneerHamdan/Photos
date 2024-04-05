package photos;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String username;
    private ArrayList<Album> albums;

    public User(String name) {
        username = name;
    }

    public String getUsername() {
        return username;
    }

    // create albums
    public void createAlbum() {
        albums.add(new Album());
    }

    // get albums list
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    // get specific album by name
    public Album getAlbum(String name) {
        for (Album album : albums) {
            if (album.getName().equalsIgnoreCase(name))
                return album;
        }
        return null;
    }

    // delete albums
    public void deleteAlbum(Album album) {
        albums.remove(album);
    }

    // rename albums
    public void renameAlbum(Album album, String name) {
        album.rename(name);
    }

    // open album

    // search for photos

    // logout

}
