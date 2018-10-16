package tech.yko.api.dokohome.service;

import tech.yko.api.dokohome.entity.Store;

/**
 * 店舗基本情報を扱うService.
 */
public interface StoreService {

    Store find(Store store);
}
