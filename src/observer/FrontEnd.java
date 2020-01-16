package observer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// OBSERVER
public class FrontEnd {
    private void valueChanged(String fielName, Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String getter = "get" + fielName.toUpperCase().charAt(0) + fielName.substring(1);
        Method get = object.getClass().getMethod(getter, null);
        Object returnGetter = get.invoke(object, null);
        System.out.println("THE " + fielName + " CHANGED !");
        System.out.println("THE NEW VALUE = " + returnGetter);
    }
    private Action action = this::valueChanged;
    public void attach(BackEnd backEnd){
        backEnd.attach(action);
    }
    public void dettach(BackEnd backEnd){
        backEnd.dettach(action);
    }

}
