package factory;

import java.lang.reflect.Type;

public class MonstreFactory {
    private MonstreFactory(){}

    public static Monstre createMonstre(TypeMonstre type){
        Monstre m = null;
        switch (type){
            case GOBELIN:
                m = createGobelin();
                break;
            case DRAGON:
                m = createDragon();
                break;
                default:
                    break;
        }
        return m;
    }

    private static Gobelin createGobelin(){
        return new Gobelin();
    }
    private static Dragon createDragon(){
        return new Dragon();
    }
}
