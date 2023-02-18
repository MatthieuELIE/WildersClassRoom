/**
 * Wilder
 */
public class Wilder {

    // Attributes
    private String firstName;
    private Boolean isAware;

    // Constructors
    public Wilder(String firstName) {
        this.firstName = firstName;
        this.isAware = false;
    }

    public Wilder(String firstName, Boolean isAware) {
        this.firstName = firstName;
        this.isAware = isAware;
    }

    // Methods
    public static String sayHi() {
        return "Hi !";
    }

    public String whoAmI() {
        if (!this.isAware) {
            return "I am " + this.firstName + " and I am not aware !";
        }

        return "I am " + this.firstName + " and I am aware !";
    }

    // Getters
    public String getFirstName() {
        return this.firstName;
    }

    public Boolean getIsAware() {
        return this.isAware;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setIsAware(boolean isAware) {
        this.isAware = isAware;
    }

}
