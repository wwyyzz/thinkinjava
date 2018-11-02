package ch9.ex17;

public class Circle implements Shape{

    @Override
    public String draw() {
        return "draw circle";
    }

    @Override
    public String redraw() {
        return "redraw circle";
    }

    @Override
    public String erase() {
        return "erase circle";
    }
}
