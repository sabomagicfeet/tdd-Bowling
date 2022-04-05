💻 Test-Driven Development - Bowling Game Kata 💻

---------------------------------------------------------------------------------------------------------

## Problem Description
Create a program, which, given a valid sequence of rolls for one line of American Ten-Pin Bowling, produces the total score for the game. Here are some things that the program will not do:

- We will not check for valid rolls.
- We will not check for correct number of rolls and frames.
- We will not provide scores for intermediate frames.

Depending on the application, this might or might not be a valid way to define a complete story, but we do it here for purposes of keeping the kata light. I think you’ll see that improvements like those above would go in readily if they were needed for real.

We can briefly summarize the scoring for this form of bowling:

- Each game, or “line” of bowling, includes ten turns, or “frames” for the bowler.
- In each frame, the bowler gets up to two tries to knock down all the pins.
- If in two tries, he fails to knock them all down, his score for that frame is the total number of pins knocked down in his two tries.
- If in two tries he knocks them all down, this is called a “spare” and his score for the frame is ten plus the number of pins knocked down on his next throw (in his next turn).
- If on his first try in the frame he knocks down all the pins, this is called a “strike”. His turn is over, and his score for the frame is ten plus the simple total of the pins knocked down in his next two rolls.
- If he gets a spare or strike in the last (tenth) frame, the bowler gets to throw one or two more bonus balls, respectively. These bonus throws are taken as part of the same turn. If the bonus throws knock down all the pins, the process does not repeat: the bonus throws are only used to calculate the score of the final frame.
- The game score is the total of all frame scores.

More info on the rules at: How to Score for Bowling

##Clues
What makes this game interesting to score is the lookahead in the scoring for strike and spare. At the time we throw a strike or spare, we cannot calculate the frame score: we have to wait one or two frames to find out what the bonus is.

##Suggested Test Cases
(When scoring “X” indicates a strike, “/” indicates a spare, “-” indicates a miss)

- X X X X X X X X X X X X (12 rolls: 12 strikes) = 10 frames * 30 points = 300
- 9- 9- 9- 9- 9- 9- 9- 9- 9- 9- (20 rolls: 10 pairs of 9 and miss) = 10 frames * 9 points = 90
- 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5 (21 rolls: 10 pairs of 5 and spare, with a final 5) = 10 frames * 15 points = 150


---------------------------------------------------------------------------------------------------------

### Sketch
- 10 Frames
  
- Each Frame contains 2 rolls
  
- Score in a Frame is the sum of the number of pins you knock down with each of 2 rolls.
> Knocked down pins with the first roll is 3, Knocked down pins with the second roll is 1, Score is 4

- Spare : If you knock down 10 pins with two rolls, (ex. first roll 4, second roll 6) , 10 + next Frame first roll knock down pin is the score.
> (ex. first roll 4, second roll 6, next Frame first roll 3 : score 13)
    
- Strike : If you knock down 10 pins with the first roll, 10 + next Frame (two rolls) score is the score.
> (ex. first roll 10, next Frame first roll 4, next Frame second roll 1 : score 15)
    
- If Spare or Strike in the last Frame, bonus 1 roll for Spare, bonus 2 rolls for Strike.