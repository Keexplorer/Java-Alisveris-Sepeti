package tr.edu.ogu.ceng.shopingcart.service;


import tr.edu.ogu.ceng.shopingcart.Config.RestClientConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import tr.edu.ogu.ceng.shopingcart.entity.User;
import tr.edu.ogu.ceng.shopingcart.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {

        private final UserRepository userRepository;

        private final RestClient restClient;

        public User saveUser(User user){

            return userRepository.save(user);

        }
        public User getUser(){
            return restClient.get().uri("http://192.168.137.195:8007/api/users/testuser").accept(MediaType.APPLICATION_JSON).retrieve().body(User.class);
        }


}
