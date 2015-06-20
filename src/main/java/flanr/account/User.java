package flanr.account;

/**
 * @author kkowalski
 */
public class User {

    private long id;
    private String username;
    private String name;
    private String password;

    public User(long id, String username, String password, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

}
