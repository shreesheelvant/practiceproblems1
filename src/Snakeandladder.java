import java.util.HashMap;
import java.util.Map;

public class Snakeandladder {
    public static void main(String[] args) throws InterruptedException {
        int player1 = 0;
        ladders.put(4, 56);
        ladders.put(14, 55);
        ladders.put(12, 50);
        ladders.put(22, 58);
        ladders.put(41, 79);
        ladders.put(54, 88);


        while (player1 <= 100) {
            int diceRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
            player1 = player1 + diceRoll;
            System.out.println("Before position: "+ player1);
            Thread.sleep(2000);
            if(ladder.get(player1) != null) {
                player1 = ladders.get(player1);
            }
            System.out.println("After position: "+ player1);
            }
        }

    }
}
