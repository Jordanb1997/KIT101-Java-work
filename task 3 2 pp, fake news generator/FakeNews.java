import java.util.Scanner;

/**
 * 3.2PP Fake News Writer
 * 
 * @author Jordan Bannister
 */
public class FakeNews {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name; //person's name
        String country;  //persons country
        int age;     //person's age
        int score1;  //jury's competition score
        int score2;  //audience' competiton score
        int total;   //aggregate score
        
        //collecting info
        System.out.println("New Fake Times");
        System.out.println();
        
        System.out.print("Enter the person's name: ");
        name = sc.nextLine();
        System.out.print("Enter the person's country: ");
        country = sc.nextLine();
        
        System.out.print("How old is the person? ");
        age = sc.nextInt();
        
        //grabbing scores
        System.out.print("what is the jury score?");
        score1 = sc.nextInt();
        System.out.print("what is the audience score?");
        score2 = sc.nextInt();
        
        total = score1 + score2;
        
        //displaying fake news
        System.out.print(country + "'s " + name + " has won this year's eurovison song contest!\n");
        System.out.print(name + " scored " + total +  " points to take the top spot.\n");
        System.out.print("At just " + age + " years of age, " + name + " is one of the youngest performers to win the contest");
    }
}