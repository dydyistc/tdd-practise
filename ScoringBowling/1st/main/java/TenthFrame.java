public class TenthFrame extends Frame {
  private int pins3;
  public TenthFrame(int pins1, int pins2, int pins3) {
    super(pins1, pins2);
    this.pins3 = pins3;
  }

  @Override
  public int score() {
    return pins1 + pins2 + pins3;
  }
}
