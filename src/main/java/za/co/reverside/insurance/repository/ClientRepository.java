package za.co.reverside.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.reverside.insurance.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}


