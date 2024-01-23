import java.util.ArrayList;

public class Song {

    private String title;
    private String artist;
    private ArrayList<String> listeners= new ArrayList<>();
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int howMany(ArrayList<String> listeners){

        int i = 0;
        for(String s : listeners){
            if(!this.listeners.contains(s.toLowerCase())){
                this.listeners.add(s.toLowerCase());
                i++;
            }
        }
        return i;
    }
}
