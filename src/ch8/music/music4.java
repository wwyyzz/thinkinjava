package ch8.music;

public class music4 {
    static void tune(Instrument i ){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e){
        for (Instrument i:e
             ) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Stringed(),
                new Brass()
        };
        tuneAll(orchestra);
    }
}
