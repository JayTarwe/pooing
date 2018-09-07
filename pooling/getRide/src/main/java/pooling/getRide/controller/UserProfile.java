package pooling.getRide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pooling.getRide.entity.Owner;
import pooling.getRide.services.PoolingServices;

import java.util.List;

@RestController
@RequestMapping("/pooling")
public class UserProfile {

    @Autowired
    PoolingServices poolingServices;

    @GetMapping("/owner-profiles")
    public List<Owner> getOwnerProfiles(){
       return poolingServices.getAllOwners();
    }
}
