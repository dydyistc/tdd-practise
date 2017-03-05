public class Frame {
  protected int pins1;
  protected int pins2;
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
    int bonus = 0;
    if (isStrikes()) {
      if (nextFrame.isStrikes()) {
        if (nextFrame.nextFrame == null) {
          bonus = nextFrame.pins1 + nextFrame.pins2;
        }else {
        bonus = nextFrame.pins1 + nextFrame.nextFrame.pins1;
        }

      } else {
        bonus = nextFrame.pins1 + nextFrame.pins2;
      }
    } else if (isSpare()) {
      bonus = nextFrame.pins1;
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
