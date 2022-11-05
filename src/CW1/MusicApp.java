package CW1;
import java.util.ArrayList;
import helpers.*;

public class MusicApp
{
  private ArrayList<Song> songs;

  public MusicApp()
  {
    songs = new ArrayList<Song>();
    addSongs();
    doMainMenu();
  }

  public void doMainMenu()
  {
    boolean wantToQuit = false;

    while(!wantToQuit)
    {
      displayMenu();
      int choice = InputReader.getInt("Please enter your song choice > ");

      switch(choice)
      {
        case 1: addSong();break;
        case 2: deleteSong();break;
        case 3: printSongs(0);break;
        case 4: printTopSongs();break;
        case 5: wantToQuit = true; break;
      }
    }
  }

  public void displayMenu()
  {
    System.out.println("\n 1. Add Song");
    System.out.println(" 2. Delete Song");
    System.out.println(" 3. Print All Songs");
    System.out.println(" 4. Print Top Songs");
    System.out.println(" 5. Quit\n");
  }

  private void addSong()
  {
    System.out.println(" Adding a song ");
    String title = InputReader.getString("Please enter the title of the song >");
    String name = InputReader.getString("Please enter the name of the artist >");
    int count = InputReader.getInt("Please enter the number of times played >");

    Song song = new Song(title, name, count);
    songs.add(song);
  }

  private void deleteSong()
  {
    printSongs(0);
    Song song = findSong();
    if (song != null)
    {
      songs.remove(song);
    }
    else System.out.println("Song not found");
        printSongs(0); 
  }

  private Song findSong()
  {
    String deleteSong = InputReader.getString("Enter the song you want to delete >");
    for(Song song : songs)
    {
      if(song.getTitle().contains(deleteSong))
          return song;
    }
    return null;
  }

}