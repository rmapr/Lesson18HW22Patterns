package patternStrategy.strategies;

public class ConcreteStrategyTriangle implements CalcStrategy{
    @Override
    public Double execute(Double a, Double b) {
        return a * b / 2;
    }
}
