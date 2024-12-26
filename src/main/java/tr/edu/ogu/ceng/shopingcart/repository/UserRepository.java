package tr.edu.ogu.ceng.shopingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tr.edu.ogu.ceng.shopingcart.entity.User;

import java.util.List;

@Repository
public interface  UserRepository  extends JpaRepository<User,Long> {

    public User getByUsername(String username);
    public void deleteById(Long id);

    @Query(value = "Select u from User u", nativeQuery = false)
    public List<User> getAllUsers();

}
