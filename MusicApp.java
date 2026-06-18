public class MusicApp {
    public static void main(String[] args) {
       Song[] songs = {
                new PopSong("Blinding Lights", "The Weeknd"),
                new RockSong("Believer", "Imagine Dragons"),
                new JazzSong("Feeling Good", "Nina Simone")
        };

        for(Song song: songs){
            song.play();
        }
    }
}

class Song{
    public String title;
    public String artist;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public void play(){
        System.out.println("Now Playing...");
    }
}

class PopSong extends Song{
    public PopSong(String title, String artist){
        super(title, artist);
    }

    @Override
    public void play(){
        System.out.println("Pop Song ");
        System.out.println("Track: " + title);
        System.out.println("Artist: " + artist);
        System.out.println();
    }
}

class RockSong extends Song{
    public RockSong(String title, String artist){
        super(title, artist);
    }

    @Override
    public void play(){
        System.out.println("Rock song ");
        System.out.println("Track: " + title);
        System.out.println("Artist: " + artist);
        System.out.println();
    }
}

class JazzSong extends Song{
    public JazzSong(String title, String artist){
        super(title, artist);
    }

    @Override
    public void play(){
        System.out.println("Jazz Song ");
       System.out.println("Track: " + title);
        System.out.println("Artist: " + artist);
        System.out.println();
    }
}