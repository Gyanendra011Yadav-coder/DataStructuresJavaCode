package nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-25,Nov,2022
 * in Project: DataStructuresJavaCode
 */
public class MainClass {
    public static void main(String[] args) throws IOException, ScriptException {

        String file = "src/main.js";
        ScriptEngine engine=new ScriptEngineManager()
                .getEngineByName("Nashorn");
        engine.eval(new FileReader("main.js"));
    }
}
