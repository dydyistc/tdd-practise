public class Frame {
  private int pins1;
  private int pins2;
  private Frame nextFrame;

  public Frame(int pins1, int pins2) {
    this.pins1 = pins1;
    this.pins2 = pins2;
  }

  public int score() {
    if (pins1 + pins2 == 10) {
      if (nextFrame.pins1 == 10) {
        return pins1 + pins2 + nextFrame.pins1 + nextFrame.nextFrame.pins1;
      }
      return pins1 + pins2 + nextFrame.pins1;
    }
    return pins1 + pins2;
  }

  public Frame getNextFrame() {
    return nextFrame;
  }

  public void setNextFrame(Frame nextFrame) {
    this.nextFrame = nextFrame;
  }
}
