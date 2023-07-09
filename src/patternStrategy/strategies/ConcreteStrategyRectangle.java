package patternStrategy.strategies;

public class ConcreteStrategyRectangle implements CalcStrategy {
    @Override
    public Double execute(Double a, Double b) {
        return a * b;
    }
}
