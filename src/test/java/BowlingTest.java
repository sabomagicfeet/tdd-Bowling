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
    // Test if game can make the score when all 20 rolled balls fall into the gutter and total score is 0
    public void canScoreGameWhenAllRollIsZero() {
        BowlingGame game = new BowlingGame();
        int expected = 0;

        for(int i = 0; i < 20; i++) {
            game.roll(0);
        }
        int actual = game.score();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    //
    public void canScoreGameWhenAllRollIsOne() {
        BowlingGame game = new BowlingGame();
        int expected = 20;

        for(int i = 0; i < 20; i++) {
            game.roll(1);
        }
        int actual = game.score();

        Assertions.assertEquals(expected, actual);
    }

}
