package za.co.reverside.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import za.co.reverside.insurance.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}


