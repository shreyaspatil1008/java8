package nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example {

    public static void main(String[] a){
        ScriptEngineManager scm = new ScriptEngineManager();
        ScriptEngine sc = scm.getEngineByName("nashorn");
        try{
            sc.eval("print('Hello World')");
            FileReader file = new FileReader("javafn.js");
            sc.eval(file);

        }catch(ScriptException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
