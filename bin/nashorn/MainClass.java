package nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created By:  Gyanendra_Yadav
 * on 2022-11-25,Nov,2022
 * in Project: DataStructuresJavaCode
 */
public class MainClass {
    public static void main(String[] args) throws FileNotFoundException, ScriptException {
        String file = "src/main.js";
        ScriptEngine engine=new ScriptEngineManager()
                .getEngineByName("Nashorn");
//        engine.eval(new FileReader("C:\\Users\\Gyanendra-Yadav\\Documents\\DataStructuresJavaCode\\src\\nashorn\\main.js"));
        engine.eval(new FileReader("main.js"));
    }
}
