import java.util.ArrayList;

public class zoo {

    public static void main(String[] args) {
        zoo z = new zoo();
//        z.sleep("Tigger");
//        z.eat("Tigger", "meat");
//        z.eat("Tigger", "bacon");

        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Unicorn rarity = new Unicorn("Rarity");
        rarity.sleep("Rarity");
        rarity.eat("marshmallows");

        Bee stinger = new Bee("Stinger");
        stinger.sleep("Stinger");
        stinger.eat("pollen");
        stinger.eat("ice cream");

        Giraffe gema = new Giraffe("Gema");
        gema.sleep("Gema");
        gema.eat("meat");
        gema.eat("leaves");

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(tigger);
        animals.add(pooh);
        animals.add(rarity);
        animals.add(stinger);
        animals.add(gema);

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals,"meat");

    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    String favoriteFood = "bacon";

    public void eat(String name, String food) {
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            System.out.println(name + " sleeps for 8 hours");
        }
    }
}

