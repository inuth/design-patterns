package observer;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

// SUJET, celui qui est observé
public class BackEnd {
    private int value;
    private double money;
    private List<Action> actions = new ArrayList<>();
    public int getValue() {
        return value;
    }

    public void setValue(int value) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (value != this.value){
            this.value = value;
            notifyChanges("value");
        }

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        if (money != this.money){
            this.money = money;
            notifyChanges("money");
        }
    }

    public void attach(Action action){
        this.actions.add(action);
    }
    public void dettach(Action action){
        this.actions.remove(action);
    }

    private void notifyChanges(String fieldName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        actions.forEach(a -> {
            try {
                a.action(fieldName, this);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }

    public void showActions(){
        actions.forEach(a -> System.out.println(a));
    }


}
