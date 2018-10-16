package tech.yko.api.dokohome.entity;

@lombok.Data
@lombok.Builder
/**
 * 店舗の基本情報を扱うエンティティ
 */
public class Store {

    int id;

    String name;

    String prefecture;

    String address;
}
