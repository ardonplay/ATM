package ATM.Card;

public class Card implements CardInterface {

  String id;
  String shortName;
  String expiresDate;

  String CVV;
  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String getShotName() {
    return shortName;
  }

  @Override
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  @Override
  public String getExpiresDate() {
    return expiresDate;
  }

  @Override
  public void setExpiresDate(String expiresDate) {
      this.expiresDate = expiresDate;
  }

  @Override
  public String getCVV() {
    return CVV;
  }

  @Override
  public void setCVV(String CVV) {
      this.CVV = CVV;
  }

  public  Card(){
    this.shortName = "ogo ogogog";
    this.expiresDate = "04/2004";
    this.id = "1111111111111111";
    this.CVV = "123";
  }

  public Card(String shortName, String expiresDate, String id, String CVV){
    this.shortName = shortName;
    this.expiresDate = expiresDate;
    this.id = id;
    this.CVV = CVV;
  }
}
