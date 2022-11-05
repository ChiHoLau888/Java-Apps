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

  private void

}