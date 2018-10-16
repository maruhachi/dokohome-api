package tech.yko.api.dokohome.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.yko.api.dokohome.entity.Store;
import tech.yko.api.dokohome.service.StoreService;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @GetMapping("/find")
    Store find(@RequestParam Store store){
        Store result = storeService.find(store);
        return result;
    }
}
