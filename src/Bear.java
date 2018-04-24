public class Bear extends Animal{

    public Bear (String name){
        super(name, "fish");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            System.out.println(name + " hibernates for 4 months");
        }
    }

    public void sleep(String name) {
        System.out.println(name + " hibernates for 4 months");
    }

}
