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
    return selfScore + calculateBonus();
  }

  private int calculateBonus() {
    if (nextFrame == null) {
      return 0;
    }
    int bonus = nextFrame.pins1;
    if (isStrikes()) {
      if (nextFrame.isStrikes()) {
        bonus += nextFrame.nextFrame.pins1;
      } else {
        bonus += nextFrame.pins2;
      }
    } else if (isSpare()) {
      if (nextFrame.isSpare()) {
        bonus += nextFrame.nextFrame.pins1;
      }
    }
    return bonus;
  }

  private boolean isStrikes() {
    return pins1 == 10;
  }

  private boolean isSpare() {
    return pins1 + pins2 == 10;
  }

  public Frame getNextFrame() {
    return nextFrame;
  }

  public void setNextFrame(Frame nextFrame) {
    this.nextFrame = nextFrame;
  }
}
