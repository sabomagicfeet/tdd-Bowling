import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingTest {

    private BowlingGame game;

    private void roll(int rollBallTimes, int pinsDown) {
        for(int i = 0; i < rollBallTimes; i++) {
            game.roll(pinsDown);
        }
    }

    @BeforeEach
    public void setUp() {
        game = new BowlingGame();
    }

    @Test
    // Test if game can make the score when all 20 rolled balls fall into the gutter and total score is 0
    public void canScoreGameWhenAllRollIsZero() {
        roll(20, 0);
        Assertions.assertEquals(0, game.score());
    }

    @Test
    //
    public void canScoreGameWhenAllRollIsOne() {
        roll(20, 1);
        Assertions.assertEquals(20, game.score());
    }

}
