
import Model.User;
import Services.UserServiceImpl;
import Services.UserServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
;

class UserTest {
    @Autowired
    private UserServices userService;

    @Test
    public void addUserTest() {
        UserServiceImpl use = new UserServiceImpl();

        User user = new User(1,"tebogo","lebepe");


    }
}