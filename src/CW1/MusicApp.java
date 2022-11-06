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

  private void printSongs(int count)
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

  private void addSongs()
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