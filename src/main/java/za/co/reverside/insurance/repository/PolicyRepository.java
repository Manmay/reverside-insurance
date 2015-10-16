package za.co.reverside.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.reverside.insurance.domain.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {

}


