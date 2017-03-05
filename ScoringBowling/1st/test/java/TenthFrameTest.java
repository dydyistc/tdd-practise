import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class TenthFrameTest {
  @Test
  public void score() throws Exception {
    TenthFrame tenthFrame = new TenthFrame(10, 10, 10);
    assertThat(tenthFrame.score(), is(30));
  }
}