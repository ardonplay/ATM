package Сurrency;

public class BYN implements Currency {


  String symbol = "BYN";

  float pricePerPiece;
  @Override
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String getSymbol() {
    return symbol;
  }

  @Override
  public void setPricePerPiece(float pricePerPiece) {
    this.pricePerPiece = pricePerPiece;
  }

  @Override
  public float getPricePerPiece() {
    return this.pricePerPiece;
  }


}
