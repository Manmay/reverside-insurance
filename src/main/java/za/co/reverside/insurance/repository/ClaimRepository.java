package za.co.reverside.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.reverside.insurance.domain.Claim;

public interface ClaimRepository extends JpaRepository<Claim, Long> {

}


