import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
  private List<Frame> frames = new ArrayList<Frame>();

  public void play(int pins1, int pins2) {
    Frame frame = new Frame(pins1, pins2);
    if (!frames.isEmpty()) {
      Frame previousFrame = frames.get(frames.size() - 1);
      if (previousFrame != null) {
        previousFrame.setNextFrame(frame);
      }
    }
    frames.add(frame);
  }

  public void play(int pins1, int pins2, int pins3) {
    TenthFrame tenthFrame = new TenthFrame(pins1, pins2, pins3);
    Frame previousFrame = frames.get(frames.size() - 1);
    previousFrame.setNextFrame(tenthFrame);
    frames.add(tenthFrame);
  }

  public int score() {
    int sum = 0;
    for (Frame frame : frames) {
      sum += frame.score();
    }
    return sum;
  }
}
