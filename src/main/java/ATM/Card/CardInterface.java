package ATM.Card;

public interface CardInterface {
  String getId();
  void setId(String id);
  String getShotName();

  void setShortName(String shortName);

  String getExpiresDate();

  void setExpiresDate(String expiresDate);

  String getCVV();

  void setCVV(String CVV);
}
