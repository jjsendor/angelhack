package flanr.account;

/**
 * @author kkowalski
 */
public class User {

    private long id;
    private String username;
    private String name;
    private String password;
    private String pictureUrl;

    public User(long id, String username, String password, String name, String pictureUrl) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.pictureUrl = pictureUrl;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

}
