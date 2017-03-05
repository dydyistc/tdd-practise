import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FrameTest {
  @Test
  public void scoreWithoutBonus() throws Exception {
    Frame frame = new Frame(5, 4);
    int score = frame.score();
    assertThat(score, is(9));
  }
}