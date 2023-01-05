package ATM.Сurrency;

public class RUB extends Currency {

  public RUB(String symbol, float pricePerPiece) {
    this.symbol = symbol;
    this.pricePerPiece = pricePerPiece;
  }

  public RUB() {
    this.symbol = "₽";
    this.pricePerPiece = (float) 100.4;
  }
}
