package CW1;
import java.util.ArrayList;
import helpers.*;

/*
 * This class will enable the program to:
 * 1) Add a new song to a list of songs
 * 2) Remove a song from a list of songs
 * 3) Print a list of all the songs stored
 * 4) Print a list of songs over a given number of plays
 */

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
      int choice = InputReader.getInt("Enter your option > "); // This allows the user to enter an option from the choices listed.

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

  public void displayMenu() // This prints the different choices on the main menu.
  {
    System.out.println("\n 1. Add Song");
    System.out.println(" 2. Delete Song");
    System.out.println(" 3. Print All Songs");
    System.out.println(" 4. Print Top Songs");
    System.out.println(" 5. Quit\n");
  }

  private void addSong() // This allows the user to add their own song and the details.
  {
    System.out.println(" Adding a song ");
    String title = InputReader.getString("Please enter the title of the song >");
    String name = InputReader.getString("Please enter the name of the artist >");
    int count = InputReader.getInt("Please enter the number of times played >");

    Song song = new Song(title, name, count);
    songs.add(song);
  }

  private void deleteSong() // This allows the user to delete a song that is stored.
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
    String deleteSong = InputReader.getString("Enter the song you want to delete >"); // This allows the user to select the song they wish to delete.
    for(Song song : songs)
    {
      if(song.getTitle().contains(deleteSong))
          return song;
    }
    return null;
  }

  private void printSongs(int count) // This will print all the songs over a number of times played which the user has selected.
  {
    System.out.println("\nPrinting All Songs\n");

    for(Song song : songs)
    {
      if(song.getTimesPlayed()>count)
          song.print();
    }
  }

  private void printTopSongs() 
  {
    int countTotal = InputReader.getInt("Enter the number of times played to see all songs with more times played >");
    printSongs(countTotal);
  }

  private void addSongs() // This is the method which will create an array of all the songs and details already in the program.
  {
    Song song = new Song("Happier", "Bastille and Marshmello", 976971409);
    songs.add(song);

    song = new Song("If I Can Dream", "Elvis Presley", 653249885);
    songs.add(song);

    song = new Song("Holiday", "KSI", 48796321);
    songs.add(song);

    song = new Song("Shape of You", "Ed Sheeran", 365896145);
    songs.add(song);

    song = new Song("Yummy", "Justin Bieber", 788652147);
    songs.add(song);

    song = new Song("Waka Waka", "Shakira", 55421569);
    songs.add(song);

    song = new Song("Love Story", "Taylor Swift", 264971346);
    songs.add(song);

    song = new Song("7 Rings", "Ariana Grande", 85695327);
    songs.add(song);

    song = new Song("Despacito", "Luis Fonsi", 862778932);
    songs.add(song);

    song = new Song("Let It Go", "Idina Menzel", 66357846);
    songs.add(song);
  }

}