package RandomNumberExtender;

public class MyRandom {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println("Next random between 0 and 22 is: " + new RandomClassExtention().nextInt(0, 22));
            System.out.println("Next random even between 50 and 100 is: " + new RandomClassExtention().nextEven(50, 100));
            System.out.println("Next random odd between 25 and 75 is: " + new RandomClassExtention().nextOdd(25, 75));
            System.out.println("Next random capitol letter is: " + new RandomClassExtention().nextCharCap());
            System.out.println("Next random lowercase letter is: " + new RandomClassExtention().nextCharLow());
            System.out.println("Next random Letter between A and L is: " + new RandomClassExtention().nextCharCap('A', 'L'));
            System.out.println("Next random Letter between g and p is: " + new RandomClassExtention().nextCharLow('g', 'p'));
            System.out.println("Next random string of 10 is: " + new RandomClassExtention().nextWord(10));
            System.out.println("Next random prime is: " + new RandomClassExtention().rndmPrime());
            System.out.println("The next random character is: " + new RandomClassExtention().rndmChar());
            }
        }
}