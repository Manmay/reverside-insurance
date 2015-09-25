package za.co.reverside.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.reverside.insurance.domain.UserDetail;

public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {

}


