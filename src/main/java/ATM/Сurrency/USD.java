package ATM.Сurrency;

public class USD extends Currency{
  public USD(String symbol, float pricePerPiece) {
    this.symbol = symbol;
    this.pricePerPiece = pricePerPiece;
  }

  public USD() {
    this.symbol = "$";
    this.pricePerPiece = (float) 9999.4;
  }
}
