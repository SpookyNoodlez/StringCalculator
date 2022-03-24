import java.util.ArrayList;

public class BigNumberLogger implements Logger{

    ArrayList list = new ArrayList();

    @Override
    public void log(Integer number) {
        //If the number isn't already in the list, add it.
        if (!list.contains(number)){
            list.add(number);
        }
    }
}
