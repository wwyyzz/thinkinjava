package ch8.music;

public class Wind extends Instrument{
    public void play(Note n){
        System.out.println("Wind.play() " + n);
    }

    @Override
    public String What() {
        return "Wind";
    }

    @Override
    public void adjust() {

    }
}


