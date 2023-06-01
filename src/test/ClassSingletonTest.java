public class ClassSingletonTest {

    public static void main(String[] args) {
        ClassSingleton singleton1 = ClassSingleton.getInstance();
        singleton1.setDescription("Première instance de Singleton");
        ClassSingleton singleton2 = ClassSingleton.getInstance();
        System.out.println("Description de singleton2 : " + singleton2.getDescription());
        boolean sameInstance = (singleton1 == singleton2);
        System.out.println("singleton1 et singleton2 sont la même instance : " + sameInstance);
    }
}
