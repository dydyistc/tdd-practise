public class Frame {
  private int pins1;
  private int pins2;
  private Frame nextFrame;
  private int selfScore;

  public Frame(int pins1, int pins2) {
    this.pins1 = pins1;
    this.pins2 = pins2;
    selfScore = pins1 + pins2;
  }

  public int score() {
    boolean isStrikes = pins1 == 10;
    if (isStrikes) {
      return selfScore + nextFrame.selfScore;
    }
    else if (isSpare(selfScore)) {
      return scoreWithBonus();
    } else {
      return selfScore;
    }
  }

  private int scoreWithBonus() {
    if (isSpare(nextFrame.pins1)) {
      return selfScore + nextFrame.pins1 + nextFrame.nextFrame.pins1;
    }
    return selfScore + nextFrame.pins1;
  }

  private boolean isSpare(int pins) {
    return pins == 10;
  }

  public Frame getNextFrame() {
    return nextFrame;
  }

  public void setNextFrame(Frame nextFrame) {
    this.nextFrame = nextFrame;
  }
}
