/**
 * ClassRoom
 */
public class ClassRoom {

    public static void main(String[] args) {

        Wilder julia = new Wilder("Julia");
        Wilder matthieu = new Wilder("Matthieu", true);
        Wilder Antoine = new Wilder("Antoine", false);

        System.out.println(julia.whoAmI());
        System.out.println(matthieu.whoAmI());
        System.out.println(Antoine.whoAmI());

        System.out.println("Changing Julia's firstname !");
        julia.setFirstName("Julie");
        System.out.println("New Julia's firstname is " + julia.getFirstName());
        System.out.println(julia.whoAmI());

    }

}
