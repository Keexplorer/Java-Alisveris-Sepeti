package tr.edu.ogu.ceng.shopingcart.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import tr.edu.ogu.ceng.shopingcart.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

        private final UserRepository userRepository;


        public User saveUser(User user){

            return userRepository.save(user);

        }





}
