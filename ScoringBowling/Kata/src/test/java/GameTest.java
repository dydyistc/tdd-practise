import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {

  private Game game;

  @Before
  public void setUp() throws Exception {
    game = new Game();
  }

  @Test
  public void testGutterGame() throws Exception {
    rollMany(20, 0);
    assertThat(game.score(), is(0));
  }

  @Test
  public void testAllOnes() throws Exception {
    rollMany(20, 1);
    assertThat(game.score(), is(20));
  }

  @Test
  public void testOneSpare() throws Exception {
    rollSpare();
    game.roll(3);
    rollMany(17, 0);
    assertThat(game.score(), is(16));
  }

  @Test
  public void testOneStrike() throws Exception {
    rollStrike();
    game.roll(3);
    game.roll(4);
    rollMany(16, 0);
    assertThat(game.score(), is(24));

  }

  @Test
  public void testPerfectGame() throws Exception {
    rollMany(12, 10);
    assertThat(game.score(), is(300));
  }

  private void rollStrike() {
    game.roll(10);
  }

  private void rollSpare() {
    game.roll(5);
    game.roll(5);
  }

  private void rollMany(int n, int pins) {
    for (int i = 0; i < n; i++) {
      game.roll(pins);
    }
  }
}