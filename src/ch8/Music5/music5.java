package ch8.Music5;

interface Instrument {
    //    public void play(Note n){
//        System.out.println("Instrument.play()");
//    }
    int VALUE = 5;
    void play(Note n);
    void adjust();
}


class Wind implements Instrument {
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("this + " + ".adjust()");
    }
}

class Stringed implements Instrument {
    public void play(Note n){
        System.out.println("Stringed.play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("this + " + ".adjust()");
    }




}

public class music5 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e
                ) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Stringed(),
//                new Brass()
        };
        tuneAll(orchestra);
    }
}