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

  @Test
  public void scoreWithSparesWhenNextFrameIsNormal() throws Exception {
    Frame frame1 = new Frame(4, 6);
    Frame frame2 = new Frame(1, 0);
    frame1.setNextFrame(frame2);

    int score = frame1.score();
    assertThat(score, is(11));
  }

  @Test
  public void scoreWithSpareWhenNextFrameIsStrike() throws Exception {
    Frame frame1 = new Frame(4, 6);
    Frame frame2 = new Frame(10, 0);
    Frame frame3 = new Frame(4, 2);
    frame1.setNextFrame(frame2);
    frame2.setNextFrame(frame3);

    assertThat(frame1.score(), is(24));
  }
}