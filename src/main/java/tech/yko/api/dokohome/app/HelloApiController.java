package tech.yko.api.dokohome.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.yko.api.dokohome.entity.Store;

@RestController
@RequestMapping(value="/hello")
public class HelloApiController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @GetMapping("/store")
    public Store store(){
        Store store = Store.builder()
                .id(1)
                .name("タイトー仙台")
                .prefecture("宮城県")
                .build();
        return store;
    }

}
