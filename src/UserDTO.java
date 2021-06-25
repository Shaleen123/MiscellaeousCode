import java.util.List;

public class UserDTO {

    public List<User> userDetails;

    public List<User> getuserDetails() {
        return userDetails;
    }

    public void setuserDetails(List<User> userDetails) {
        this.userDetails = userDetails;
    }

}
