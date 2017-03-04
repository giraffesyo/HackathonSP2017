import java.util.Scanner;

public class Main {
    public static void main ( String[] args ){
        System.out.println("Please Enter your Battle Tag without tag numbers: ");

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println("Please enter the number that comes after your username: ");
        String number = s.nextLine();


        Machine statsGrabber = new Machine();
        statsGrabber.updateStats(name,number);

        //System.out.println(statsGrabber.getRawStats());
        Data DT = new Data(statsGrabber.getRawStats());
        System.out.println("Avatar URL: " + DT.getAvatar());
        System.out.println("Level: " + DT.getLevel());
        System.out.println("Bronze Medals: " + DT.getMedals_bronze());
        System.out.println("Silver Medals: " + DT.getMedals_silver());
        System.out.println("Gold Medals: " + DT.getMedals_gold());
        System.out.println("Win Rate: " + DT.getWin_rate());
        System.out.println("Most Objective Kills in one game: " + DT.getObjective_kills_most_in_game());
    }
}
