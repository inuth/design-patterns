package singleton;

public class UniqueService {
    // le but du singleton est de récupérer toujours la même instance unique d'une objet.
    private static UniqueService instance;
    private UniqueService(){}
    public static UniqueService getInstance(){
        if (instance == null){
            instance = new UniqueService();
        }
        return instance;
    }
}
