package ch8.music;

abstract class Instrument {
//    public void play(Note n){
//        System.out.println("Instrument.play()");
//    }
    private int i;
    public abstract void play(Note n);
    public String What() {
        return ("Instrument");
    }
    public abstract void adjust();
}
