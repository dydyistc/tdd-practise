import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class BowlingGameTest {
  @Test
  public void scoreTotalFrames() throws Exception {
    BowlingGame game = new BowlingGame();
    game.play(4, 5); //9
    game.play(5, 5); // 20
    game.play(10, 0); // 16
    game.play(4, 2); // 6
    game.play(3, 6); // 9
    game.play(5, 2); // 7
    game.play(7, 3); // 18
    game.play(8, 2); // 13
    game.play(3, 2); // 5
    game.play(10, 5, 5); // 20

    assertThat(game.score(), is(123));
  }

  @Test
  public void scoreWithPerfectGame() throws Exception {
    BowlingGame game = new BowlingGame();
    game.play(10, 0);
    game.play(10, 0);
    game.play(10, 0);
    game.play(10, 0);
    game.play(10, 0);
    game.play(10, 0);
    game.play(10, 0);
    game.play(10, 0);
    game.play(10, 0);
    game.play(10, 10, 10);

    assertThat(game.score(), is(300));
  }
}