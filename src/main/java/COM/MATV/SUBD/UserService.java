package COM.MATV.SUBD;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    UserInterface userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public List<User> listAll() {
        return (List<User>) userRepository.findAll();
    }

    public User get(int id) {
        return userRepository.findById(id).get();
    }

    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
