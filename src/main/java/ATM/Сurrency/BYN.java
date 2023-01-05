package ATM.Сurrency;

public class BYN extends Currency {


  public BYN(String symbol, float pricePerPiece) {
    this.symbol = symbol;
    this.pricePerPiece = pricePerPiece;
  }

  public BYN() {
    this.symbol = "BYN";
    this.pricePerPiece = (float) 10.1;
  }
}
