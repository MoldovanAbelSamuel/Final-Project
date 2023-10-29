package FinalProject.org.drivingTest.Service;

import FinalProject.org.drivingTest.Model.User;
import FinalProject.org.drivingTest.Model.UserDTO;
import FinalProject.org.drivingTest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

@Service
public class UserService {
    public UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers(){
        return this.userRepository.findAll();
    }

    public User addUser(User user){
        return this.userRepository.save(user);
    }

    public User checkUser(UserDTO user){
        User user1 = this.userRepository.findByUsername(user.getUsername());
        if(user1 == null){
            return null;
        }
        if(this.matchesPassword(user.getPassword(), user1.getPassword())){
            return user1;
        }
        //bad password
        return null;
    }

    public boolean matchesPassword(String rawPassword, String encodedPassword) {
        return BCrypt.checkpw(rawPassword, encodedPassword);
    }
}
