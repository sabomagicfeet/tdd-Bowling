import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingTest {

    @Test
    public void canMakeGame() {
        BowlingGame game = new BowlingGame();
    }

    @Test
    public void canRollBall() {
        BowlingGame game = new BowlingGame();
        game.roll(0);
    }


}
