package pooling.getRide.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pooling.getRide.dao.OwnersRepository;
import pooling.getRide.entity.Owner;
import pooling.getRide.services.PoolingServices;

import java.util.ArrayList;
import java.util.List;

@Service
public class PoolingServiceImpl implements PoolingServices {

    @Autowired
    OwnersRepository ownersRepository;

    @Override
    public List<Owner> getAllOwners() {
        System.out.println("list of xxxx");
        List<Owner> allOwnersList = new ArrayList<>();
        Iterable<Owner> allOwners = ownersRepository.findAll();
        allOwners.forEach(allOwnersList::add);
        return allOwnersList;
    }


}
