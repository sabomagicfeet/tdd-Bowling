import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingTest {

    private BowlingGame game;

    @BeforeEach
    public void setUp() {
        game = new BowlingGame();
    }

    @Test
    // Test if game can make the score when all 20 rolled balls fall into the gutter and total score is 0
    public void canScoreGameWhenAllRollIsZero() {
        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        Assertions.assertEquals(0, game.score());
    }

    @Test
    // Test if game can make the score when all 20 rolled balls knock down 1 pin.
    public void canScoreGameWhenAllRollIsOne() {
        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1);
        Assertions.assertEquals(20, game.score());
    }

    @Test
    // Test for when spare and new next roll is 3
    // ex) First Roll 5, Second Roll 5 (Spare) and the next Roll 3
    // The First Frame is 13 (10 + 3) and the next Frame's first roll is 3 so total score is 16
    public void canScoreSpareFollowedByThree() {
        game.roll(5,5, 3,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        Assertions.assertEquals(16, game.score());
    }

    // Test for Strike
    // 16 + 6 = 22
    @Test
    public void canScoreStrikeFollowedByThreeThenThree() {
        game.roll(10, 3,3, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);
        Assertions.assertEquals(22, game.score());
    }

}
