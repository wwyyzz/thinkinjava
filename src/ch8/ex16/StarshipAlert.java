package ch8.ex16;

class AlertStatus{
    public void alert (){}
}

class redAlert extends AlertStatus{
    public void alert () {
        System.out.println("red alert");
    }
}

class orangeAlert extends AlertStatus{
    public void alert () {
        System.out.println("orange alert");
    }
}

class greenAlert extends AlertStatus{
    public void alert () {
        System.out.println("green alert");
    }
}


class Starship {
    AlertStatus as = new redAlert();
    public void changeOrange (){as = new orangeAlert();}
    public void changeGreen (){as = new greenAlert();}
    public void alert(){as.alert();}
}



public class StarshipAlert{
    public static void main(String[] args) {
        Starship ss = new Starship();
        ss.alert();
        ss.changeOrange();
        ss.alert();
        ss.changeGreen();
        ss.alert();
    }
}
