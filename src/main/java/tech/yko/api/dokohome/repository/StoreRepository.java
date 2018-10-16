package tech.yko.api.dokohome.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tech.yko.api.dokohome.entity.Store;

@Repository
@Mapper
public interface StoreRepository {

    @Select("select * from store where prefecture = #{store.prefecture}")
    Store find(Store store);
}
