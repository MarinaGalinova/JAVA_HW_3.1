public class BonusMilesService {
    public int calculate (int price) //завели функцию calculate от переменной price - стоимость билета типа int

    {
        int amount = 20; // количество бонусных миль для 1 бонусного балла
        int calc = price / amount; // Бонусных миль начислено
        return calc;
    }

}
