package patternStrategy.contexts;

import patternStrategy.strategies.CalcStrategy;

public class Context {
    private CalcStrategy strategy;

    public void setStrategy(CalcStrategy strategy) {
        this.strategy = strategy;
    }

    public Double executeStrategy(Double a, Double b) {
        return strategy.execute(a, b);
    }
}
