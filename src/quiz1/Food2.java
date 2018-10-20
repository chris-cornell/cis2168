//Code in textbook (Ch 1) & lectures
//Abstract class Food2 with multiple abstract methods

package quiz1;

public abstract class Food2 {

    private String name;
    private double calories;

    //concrete method
    public Food2(String name, double calories) 
    {
        this.name = name;
        this.calories = calories;
    }

    //concrete method

    public double getCalories() {
        return calories;
    }

    //conrete method
    public String getName() {
        return name;
    }

    // Abstract methods
    public abstract double percentProtein();

    public abstract double percentFat();

    public abstract double percentCarbs();

}