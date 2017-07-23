package stone;
import stone.ClassParser;
import stone.ParseException;
import stone.BasicInterpreter;
import stone.NestedEnv;
import stone.Natives;

public class ClassInterpreter extends BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new ClassParser(), new Natives().environment(new NestedEnv())); 
    }
}
