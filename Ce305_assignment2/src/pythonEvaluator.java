import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.python.util.PythonInterpreter;

import java.io.IOException;

public class pythonEvaluator{

    public void evaluatePythonCode(String textFile) throws IOException {
        CharStream in = CharStreams.fromFileName(textFile);
        try (
                PythonInterpreter pyInterp = new PythonInterpreter()) {
                pyInterp.exec(in.toString());
        } catch (Exception e){
            System.out.println("Wrong python code");
        }
    }
}
