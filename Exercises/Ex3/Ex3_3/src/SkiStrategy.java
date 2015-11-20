/**
 * Created by alongreen on 14/11/2015.
 */
public class SkiStrategy implements Strategy {
    @Override
    public boolean checkTemperature(int temperature) {
        if (temperature<-5) return true;
        return false;
    }
}
