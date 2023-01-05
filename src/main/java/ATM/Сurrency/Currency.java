package ATM.Сurrency;

public class Currency implements CurrencyInterface {

  String symbol = "ogo";

  float pricePerPiece = 0;

  @Override
  public String getSymbol() {
    return symbol;
  }

  @Override
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public float getPricePerPiece() {
    return pricePerPiece;
  }

  @Override
  public void setPricePerPiece(float pricePerPiece) {
    this.pricePerPiece = pricePerPiece;
  }
}
