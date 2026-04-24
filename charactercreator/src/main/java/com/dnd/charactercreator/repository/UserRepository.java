package com.dnd.charactercreator.repository;
import com.dnd.charactercreator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, String> {
}
