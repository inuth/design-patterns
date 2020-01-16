package factory;

public enum TypeMonstre {
    GOBELIN("gobelin"),
    DRAGON("dragon");

    private String name;
    TypeMonstre(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double attaque(){
        return 5;
    }
}
