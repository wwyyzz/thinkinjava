package ch8.music;

class Stringed extends Instrument {
    public void play(Note n){
        System.out.println("Stringed.play()" + n);
    }

    @Override
    public String What() {
        return "Stringed";
    }

    @Override
    public void adjust() {
    }
}

class Brass extends Instrument {
    public void play(Note n){
        System.out.println("Brass.play()" + n);
    }

    @Override
    public void adjust() {
        System.out.println("Brass.adjust()");
    }
}


public class music2 {
    public static void tune(Wind i){
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed i){
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Brass i){

        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute);
        tune(violin);
        tune(frenchHorn);
    }
}
