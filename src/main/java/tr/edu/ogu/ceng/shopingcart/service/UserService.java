package tr.edu.ogu.ceng.shopingcart.service;


import tr.edu.ogu.ceng.shopingcart.Config.RestClientConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import tr.edu.ogu.ceng.shopingcart.dto.SettingDto;
import tr.edu.ogu.ceng.shopingcart.dto.UserDto;
import tr.edu.ogu.ceng.shopingcart.entity.Setting;
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

        public UserDto getUser(Long id){
            User user =userRepository.getReferenceById(id);

            return convertToDtoUser(user);

        }

        public User getUserFromUserGroup(){
            return restClient.get().uri("http://192.168.137.195:8007/api/users/testuser").accept(MediaType.APPLICATION_JSON).retrieve().body(User.class);
        }

        private UserDto convertToDtoUser(User user){
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setPassword(user.getPassword());
            userDto.setEmail(user.getEmail());
            userDto.setUsername(user.getUsername());
            userDto.setFirstName(user.getFirstName());
            userDto.setLastName(user.getLastName());
            userDto.setAddress(user.getAddress());
            userDto.setCreatedAt(user.getCreatedAt());
            userDto.setCreatedBy(user.getCreatedBy());
            userDto.setDeletedAt(user.getDeletedAt());
            userDto.setDeletedBy(user.getDeletedBy());
            userDto.setUpdatedAt(user.getUpdatedAt());
            userDto.setUpdatedBy(user.getUpdatedBy());
            userDto.setVersion(user.getVersion());

            return userDto;


        }


}
