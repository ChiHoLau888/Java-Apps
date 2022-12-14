package CW1;

public class Song 
{

    private String title;

    private String artist;

    private int timesPlayed;

    public Song(String title, String name, int count) // Defining the variables.
    {
        this.title = title;
        this.artist = name;
        this.timesPlayed = count;
    }

    public void print()
    {
        System.out.println(title + " by " + artist + " - " + timesPlayed); // This is the format the data will be displayed in.
    }

    public String getTitle()
    {
        return title;
    }

    public int getTimesPlayed()
    {
        return timesPlayed;
    }

}
