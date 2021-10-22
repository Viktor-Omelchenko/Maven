public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    // подготавливаем данные:
    long amount = 100_60;
    boolean notRegistered = true;
    long expected = 10;

    // вызываем целевой метод:
    long actual = service.calculate(amount, notRegistered);

    System.out.println(passed);
  }
}
