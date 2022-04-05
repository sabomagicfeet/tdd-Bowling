import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingTest {

    @Test
    public void canMakeGame() {
        BowlingGame bowlingGame = new BowlingGame();
    }

    @Test
    public void canRollBall() {
        BowlingGame game = new BowlingGame();
        game.roll(0);
    }

    @Test
    // When the ball is fall to the side gutter and can't knock down any pin, score 0
    // Test if game can make the score when all 20 rolled balls fall into the gutter and total score is 0
    public void canScoreGutterGame() {
        BowlingGame game = new BowlingGame();
        int expected = 0;

        for(int i = 0; i < 20; i++) {
            game.roll(0);
        }
        int actual = game.score();

        Assertions.assertEquals(expected, actual);

    }

}
