package flanr.tour;

import flanr.account.User;

/**
 * @author kkowalski
 */
public class Guide extends User {

    public Guide(long id, String username, String password, String name, String pictureUrl) {
        super(id, username, password, name, pictureUrl);
    }

}
