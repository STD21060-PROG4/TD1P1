public class ClassUniqueInstanceTest {

    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        int click = singleton.getClick();
        System.out.println("Valeur de click : " + click);
        singleton.setClick(5);
        int updatedClick = singleton.getClick();
        System.out.println("Nouvelle valeur de click : " + updatedClick);
    }
}
