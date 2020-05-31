package CS211test1.TestGame;


abstract class Character{
    abstract void left();
    abstract void right();

    Character(){
        left();
        right();
    }

}

class Mario extends Character{

    @Override
    void left() {
        System.out.println("Mario is jumping.");
    }

    @Override
    void right() {
        System.out.println("Mario is Flying.");
    }
}

class Ninja extends Character{
    @Override
    void left(){
        System.out.println("Ninja is crying");
    }

    @Override
    void right(){
        System.out.println("Ninja is sleeping");
    }
}

public class Game {
    public static void main(String[] args) {
        Character mario = new Mario();
        Character ninja = new Ninja();
        mario.left();
        mario.right();
        ninja.left();
        ninja.right();
    }
}
