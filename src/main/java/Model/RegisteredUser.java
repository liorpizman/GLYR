package Model;

/**
 * This class represents a user in the data base
 */
public class RegisteredUser extends AUser{
    private String user_name;
    private String password;
    private String first_name;
    private String last_name;
    private String city;
    private String date;

    /**
     * This is a default constructor to create a new user
     *
     * @param user_name
     * @param password
     * @param first_name
     * @param last_name
     * @param city
     * @param date
     */
    public RegisteredUser(String user_name, String password, String first_name, String last_name, String city,
                         String date) {
        this.user_name = user_name;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.city = city;
        this.date = date;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getPassword() {
        return password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDate(String date) {
        this.date = date;
    }

    /**
     * This method prints all the data of the user
     */
    public void printUser() {
        System.out.println(user_name + ", " + password + ", " + first_name + ", " + last_name + ", " + city + ", " + date);
    }
}
