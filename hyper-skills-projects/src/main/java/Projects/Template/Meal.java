package Projects.Template;

abstract class Meal {


    public void doMeal() {
        // write your code here ...
        this.prepareIngredients();
        this.cook();
        this.eat();
        this.cleanUp();
    }

    public abstract void prepareIngredients();
    public abstract void cook();

    public void eat() {
        System.out.println("That's good");
    }

    public abstract void cleanUp();
}