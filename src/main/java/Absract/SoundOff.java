package Absract;

import org.checkerframework.checker.units.qual.A;

public class SoundOff{
    public static void main(String[] args) {

        Animal animal1 = new Animal() {
            @Override
            void soundOff() {
                super.soundOff();
            }
        };

        Llama llama1 = new Llama();
        Doggo doggo1 = new Doggo();
        Dragon dragon1 = new Dragon();

        animal1.soundOff();
        llama1.soundOff();
        doggo1.soundOff();
        dragon1.soundOff();
    }
}
