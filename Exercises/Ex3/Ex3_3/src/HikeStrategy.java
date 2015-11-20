/**
 * Created by alongreen on 14/11/2015.
 */
public class HikeStrategy implements Strategy{

    @Override
    public boolean checkTemperature(int temperature) {
       if (temperature>=10 && temperature <=23)
       {
           return true;
       }
        return false;
    }
}
