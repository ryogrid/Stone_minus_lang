package stone;
import javassist.gluonj.util.Loader;
import stone.ClosureEvaluator;
import stone.NativeEvaluator;
import stone.ClassEvaluator;
import stone.ClassInterpreter;

public class Stone {
    public static void main(String[] args) throws Throwable {
        Loader.run(ClassInterpreter.class, args, ClassEvaluator.class,
                   ArrayEvaluator.class, NativeEvaluator.class,
                   ClosureEvaluator.class);
    }
}
