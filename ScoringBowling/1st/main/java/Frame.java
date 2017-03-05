public class Frame {
  private int pins1;
  private int pins2;

  public Frame(int pins1, int pins2) {
    this.pins1 = pins1;
    this.pins2 = pins2;
  }

  public int score() {
    return pins1 + pins2;
  }
}
