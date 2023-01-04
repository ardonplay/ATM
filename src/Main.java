import ATM.Сurrency.*;
public class Main {

  public static void main(String[] args) {
    RUB rub = new RUB("RUB", 1);

    RUB rub2 = new RUB();
    System.out.println(rub2.getSymbol());
  }
}