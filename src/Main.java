public class Main {

    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService(); //создали переменную service в которой можно класть
        //только объекты BonusMilesService
        int price = 40; //задаем переменную на вход для функции calculate
        int miles = service.calculate(price); //инициализируем переменную miles, которую возвращает
        // переменная service в классе BonusMilesService, которая рассчитывается функцией (методом) calculate
        // от переменной price
        System.out.println(miles);

    }
}
