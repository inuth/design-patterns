package singleton;

public class Main {
    public static void main(String[] args) {

        UniqueService u1 = UniqueService.getInstance();
        UniqueService u2 = UniqueService.getInstance();

        System.out.println(u1 == u2);
    }
}
