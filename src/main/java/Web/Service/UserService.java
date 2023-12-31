package Web.Service;

import Web.Models.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void addUser(User user);
    void removeUser(int id);
    User showUser(int id);
    void updateUserParams(int id, User user);
    User findByName(String name);
}
