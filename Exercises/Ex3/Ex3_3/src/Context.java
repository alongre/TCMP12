/**
 * Created by alongreen on 14/11/2015.
 */
public class Context {
    private int temperature;
    private Strategy strategy;

    public Context(int temperature, Strategy strategy) {
        this.temperature = temperature;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean getResult() {
        return strategy.checkTemperature(temperature);
    }

}
