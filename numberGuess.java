import java.util.Scanner;
//small coding game that generates random number 0-100  and tells user whether
//their guess needs to be lower or higher
public class numberGuess
{
    public static void main(String[] args) {
        int ran = (int) (Math.random() * 101);
        //System.out.println(ran); to test whether number is generating correctly

        Scanner kbd = new Scanner(System.in);

        System.out.println("Guess what the number is(0-100): ");
        int guess = kbd.nextInt();
        while (guess != ran) {
            if (guess > ran) {
                System.out.println("Guess too high, try again!");
                guess = kbd.nextInt();
            } else if (guess < ran) {
                System.out.println("Guess too low, try again!");
                guess = kbd.nextInt();
            }

        }
        if(guess ==ran)
            System.out.println("Congrats! The number is " + ran);
    }
}
