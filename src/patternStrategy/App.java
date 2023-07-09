package patternStrategy;

import patternStrategy.contexts.Context;
import patternStrategy.service.Service;
import patternStrategy.strategies.ConcreteStrategyRectangle;
import patternStrategy.strategies.ConcreteStrategyTriangle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Context context = new Context();
        System.out.println("""
                Choice:
                1 - Rectangle
                2 - Triangle
                0 - Exit""");
        int figure = sc.nextInt();

        switch (figure){
            case 1 -> context.setStrategy(new ConcreteStrategyRectangle());
            case 2 -> context.setStrategy(new ConcreteStrategyTriangle());
            default -> System.out.println("Exit");
        }
        if (figure == 1 || figure == 2) {
            Service service = new Service(figure);
            System.out.println("Figure " + service.getNameFigure());
            System.out.println("Entered first side");
            Double sideA = sc.nextDouble();
            System.out.println("Entered second side");
            Double sideB = sc.nextDouble();

            // Операція зі стратегією:
            Double result = context.executeStrategy(sideA, sideB);

            System.out.println("Square: " + new DecimalFormat("#.00").format(result));
        }
        sc.close();
    }
}
