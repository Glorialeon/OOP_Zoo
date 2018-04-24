public class Animal {
    String name;
    String favoriteFood;
    static int population = 0;

    public Animal(String name, String favoriteFood){
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;
    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            System.out.println(name + " sleeps for 8 hours");
        }
    }

}
