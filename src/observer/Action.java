package observer;

import java.lang.reflect.InvocationTargetException;

@FunctionalInterface
public interface Action {
    void action(String fieldName, Object object) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException;
}
