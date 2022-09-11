import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Create your own music playlist
        LinkedList<String> LofiPlaylist = new LinkedList<>();

        System.out.println("--- Chill Music ---");
        System.out.println("Your favorite relaxing Lofi, gaming, and studying musics\n");
        System.out.println("These are some of our most recommended:");

        // 2. Add 5 new songs to your Playlist
        Lofilist.add("End of a Life by Mori Calliope");
        LofiPlaylist.add("Ninomae Inanis Violet");
        LofiPlaylist.add("Gawr Guraw stay with me");
        LofiPlaylist.add("Aimer Brave shine");
        LofiPlaylist.add("Migraine Japanese version");

        System.out.println(Lofilaylist);

        //Add a new song at the front of the Playlist 
        //Add a new song at the end of the Playlist 
        System.out.println("\nFeaturing some of our most played songs.");

        LofiPlaylist.addFirst("Owl City Fireflies");
        LofiPlaylist.addLast("When can I see you again Owl City");
        
        System.out.println(LofiPlaylist);

        //Display the song at the front of the Playlist
        System.out.print("\nStarting off our playlist, we present");
        System.out.println(LofiPlaylist.get(0));

        //Replace the last song 
        System.out.println("\nHello there, there is an update for our Lofi playlist, it has been changed to  \"NekoNeko\");
        LofiPlaylist.set(6, "NekoNeko");

        //Remove the first song 
        System.out.println("Thanks for dropping by!, Our first song Ninomae Inanis Violet was on top of the playlist.\n");
        LofiPlaylist.remove(0);

        //Display all songs in your Playlist
        System.out.println("Here is our updated playlist!");
        System.out.println(LofiPlaylist);

    }
}