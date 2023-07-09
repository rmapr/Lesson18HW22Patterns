package patternStrategy.service;

public class Service {
    private String nameFigure;

    public Service(int figure) {
        switch (figure) {
            case 1 -> nameFigure = "Rectangle";
            case 2 -> nameFigure = "Triangle";
        }
    }

    public String getNameFigure() {
        return nameFigure;
    }
}
