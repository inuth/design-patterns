package observer;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
            BackEnd backEnd = new BackEnd();
            FrontEnd frontEnd = new FrontEnd();


            Action action = (String fieldName, Object object) -> System.out.println("J'AI FAIT QQCH !");
            Action action2 = Main::qqch;

            frontEnd.attach(backEnd);
            frontEnd.attach(backEnd);
            frontEnd.dettach(backEnd);
            backEnd.attach(action);

            backEnd.setMoney(42);

            backEnd.showActions();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static void qqch(String a, Object b){
        System.out.println("J'AI FAIT QQCH !");
    }
}
