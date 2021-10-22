public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    // подготавливаем данные:
    long amount = 1000_60;
    boolean notRegistered = true;
    long expected = 10;

    // вызываем целевой метод:
    long actual = service.calculate(amount, notRegistered);

    // производим проверку (сравниваем ожидаемый и фактический):
    // если true - то PASS
    // если false - то FAIL
    boolean passed = expected == actual;

    // выводим результат
    System.out.println(passed);
  }
}
