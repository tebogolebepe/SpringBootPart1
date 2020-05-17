package Services;


import Repository.FakeRepo;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServices {

    FakeRepo user;



    public void addUser(long id, String name, String surname){
        user.insertUser(id,name,surname);
        System.out.println(user);
    }

    public void getUser(long id){
        user.findUserById(id);
        System.out.println("Hello " + user);
    }

    public void removeUser(long id){
        user.deleteUser(id);
        System.out.println(user + " removed");
    }

}