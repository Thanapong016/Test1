import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
    
        Scanner kb = new Scanner(System.in);
        System.out.print ("Enter Num=");
        int score=kb.nextInt();
        if (score>=80) {
            System.out.println("Grade A") ;
        } else if(score >=75) {
            System.out.println("Grade B+") ;
        } else if(score >=70) {
            System.out.println("Grade B") ;
        } else if(score >=65) {
            System.out.println("Grade C+") ;
        } else if(score >=60) {
            System.out.println("Grade C") ;
        } else if(score >=55) {
            System.out.println("Grade D+") ;
        } else if(score >=50) {
            System.out.println("Grade D") ;
        } else  {
            System.out.println("Grade F") ;
        }
    }
}