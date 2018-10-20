package quiz1;
public class Quiz1 {
    public static void main(String[] args) 
    {
        Food2 bigO = new Orange();
        double protein = bigO.percentProtein();
        System.out.print(protein);
    }
}
class Orange extends Food2 
{
    public Orange()
    {
        super("Orange", 45);
    }
    public double percentProtein()
    {
        return 7;
    }
    public double percentFat()
    {
        return 2;
    }
    public double percentCarbs()
    {
        return 91;
    }
}
