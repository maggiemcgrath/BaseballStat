import java.util.Scanner;
public class BaseballStat
{
    public static void main(String[] args)
    {
    double BA,SP,TB;
    int SING,DOUB,TRI,HR,AB,HITS,HBP,BB,R,SF;
    
    String Name;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter Singles");
    SING = sc.nextInt();
    
    System.out.print("Enter # of Doubles");
    DOUB = sc.nextInt();
    
    System.out.print("Enter # of Triples");
    TRI = sc.nextInt();
    
    System.out.print("Enter # of Homeruns");
    HR = sc.nextInt();
    
    System.out.print("Enter At Bats");
    AB = sc.nextInt();
    
    System.out.print("Enter Hit By Pitch");
    HBP = sc.nextInt();
    
    System.out.print("Enter # of Walks");
    BB = sc.nextInt();
    
    System.out.print("Enter # of Runs");
    R = sc.nextInt();
    
    System.out.print("Enter # of Sacrificed Flies");
    SF = sc.nextInt();
    
    System.out.print("Player name");
    Name = sc.nextLine();
    

    TB= (SING + (DOUB*2) + (TRI *3) +(HR *4)); //Total Bases
    HITS = SING+DOUB+TRI+HR; //Hits
    SP= TB/AB; //Slugging Percentage
    BA= HITS/AB;//Batting Average
    
    System.out.println(""+Name);
    
    System.out.printf("Total Bases is %.3f\n", TB);
    
    System.out.printf("Slugging %% is %.3f\n", SP);
    
    System.out.printf("Batting avg is %.3f\n", BA);
    
    System.out.printf("On Base %% is %.3f\n", (HITS+BB+HBP)/(AB+BB+HBP+SF));
    
    System.out.printf("On Base %% + Slugging %% is %.3f\n", ((HITS+BB+HBP)/(AB+BB+HBP+SF))+SP);
    }
}

