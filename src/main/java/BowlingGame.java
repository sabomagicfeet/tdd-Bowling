public class BowlingGame {
    private int roll = 0;

    // For storing the whole pinsDown of the each roll
    private int[] rolls = new int[21]; // the most rolls you can have in the game. (no Strike and one Spare in the last Frame)

    private int score = 0;

    // Overloading
    public void roll(int... rolls) { // variable arguments // varargs
        for(int pinsDown : rolls) {
            roll(pinsDown);
        }
    }

    public void roll(int pinsDown) {
        // Store the pinsDown number in the array [current roll] and increase the roll
        rolls[roll++] = pinsDown;
    }

    public int score() {
        int score = 0;
        int cursor = 0;

        for(int frame = 0; frame < 10; frame++) {
            if(rolls[cursor] == 10) {
                score = score + 10 + rolls[cursor + 1] + rolls[cursor + 2];
                cursor += 1;
            }
            else if(isSpare(cursor)) { // Spare
                score = score + 10 + rolls[cursor + 2];
                cursor += 2; // move cursor to the next Frame
            } else {
                score = score + rolls[cursor] + rolls[cursor + 1];
                cursor += 2; // move cursor to the next Frame
            }
        }
        return score;
    }

    private boolean isSpare(int cursor) {
        return rolls[cursor] + rolls[cursor + 1] == 10;
    }
}
