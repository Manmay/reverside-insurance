package za.co.reverside.insurance.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import za.co.reverside.insurance.domain.Client;
import static za.co.reverside.insurance.mapper.Mapper.toClient;
import za.co.reverside.insurance.model.ClientCommandModel;
import za.co.reverside.insurance.repository.ClientRepository;

@RestController
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping(value = "api/createclient", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void addClaim(@RequestBody ClientCommandModel clientCommandModel) {
        System.out.println("[Start] Create a new client");
        Client client  = toClient(clientCommandModel);
        clientRepository.save(client);
        System.out.println("[Finish] Create a new client");
    }
       
    @RequestMapping(value = "api/clients", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Client> getAllClients(){
        return clientRepository.findAll();
    }
    
     @RequestMapping(value = "api/clients/{id}", method = RequestMethod.GET, produces = "application/json")
	public Client getClient(@PathVariable("id")  Long id){          
            Client client = clientRepository.findOne(id);
            System.out.println("[Start] Extract client informatiom");
		return client;
	}
}
