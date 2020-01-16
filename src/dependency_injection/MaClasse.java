package dependency_injection;

public class MaClasse {
    private Service service;

    public MaClasse(Service service){
        this.service = service;
    }
    public void setService(Service service){
        this.service = service;
    }
}
