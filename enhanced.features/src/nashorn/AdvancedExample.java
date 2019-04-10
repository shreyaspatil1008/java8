package nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AdvancedExample {
    public static void main(String[] a){
        ScriptEngineManager scm = new ScriptEngineManager();
        ScriptEngine sc = scm.getEngineByName("nashorn");
        try{
            FileReader file = new FileReader("functions.js");
            sc.eval(file);
            Invocable inv = (Invocable) sc;
            Object result;
            result = inv.invokeFunction("sayHello", "Priya");
            System.out.println(result);
            result = inv.invokeFunction("doAdd", 10,20);
            System.out.println(result);
        }catch(ScriptException e){
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
