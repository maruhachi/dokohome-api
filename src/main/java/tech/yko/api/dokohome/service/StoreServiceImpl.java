package tech.yko.api.dokohome.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.yko.api.dokohome.entity.Store;
import tech.yko.api.dokohome.repository.StoreRepository;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreRepository storeRepository;


    public Store find(Store store){
        Store result = storeRepository.find(store);
        return result;
    }

}
