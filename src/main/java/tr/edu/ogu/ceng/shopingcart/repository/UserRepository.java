package tr.edu.ogu.ceng.shopingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tr.edu.ogu.ceng.shopingcart.entity.User;

@Repository
public interface  UserRepository  extends JpaRepository<User,Long> {
}
