package template_pattern;

public abstract class Employee {
    public double calculImpot(){
        return calculSalaire() * 0.21;
    }
    public abstract double calculSalaire();

    public abstract void traitementMilieu();
    public void doSmth(){
        System.out.println("TRAITEMENT GENERAL DEBUT");
        traitementMilieu();
        System.out.println("TRAITEMENT GENERAL FIN");
    }
}
