

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

       
        boolean result6 = Wordle.processGuess("stain", "stain");
        System.out.println(result6);
        
        console.close();
    }
}
