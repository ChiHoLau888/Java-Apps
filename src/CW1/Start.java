package CW1;

public class Start 
{
    public static void main(String[] args) // This will be printed on the main menu when the program is run.
    {
        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("Music App (CW1)");
        System.out.println();
        System.out.println("By Chi Ho Lau");
        System.out.println();

        MusicApp app = new MusicApp();
        app.doMainMenu();
    }
}
