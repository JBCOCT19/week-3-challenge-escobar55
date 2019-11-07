public class Resume {
    private String name;
    private String email;

    public Resume() {
    } //Default constructor

    public Resume(String name, String email ) {
        this.name = name;
        this.email = email;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayText(){
        System.out.println(name);
        System.out.println(email);
    }

    public void displayLines(){
        System.out.println("========================================================================");
        System.out.println("===                              RESUME                              ===");
        System.out.println("========================================================================");
    }
}
