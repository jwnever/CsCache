package com.iamnotgay.cscache;

import com.iamnotgay.cscache.store.DataStore;
import com.iamnotgay.cscache.store.PutStatus;
import com.iamnotgay.cscache.store.StoreAccessException;
import com.iamnotgay.cscache.store.ValueHolder;

/**
 * @author zhangyongchao[sanmao]
 * 2018/3/5
 * des: 直接使用CsCache的时候,接口类
 **/
public class CsCache<K,V> {

    private DataStore<K,V> dataStore;

    public CsCache(DataStore<K, V> dataStore) {
        this.dataStore = dataStore;
    }


    public V get(K key) throws StoreAccessException{
        ValueHolder<V> holder = dataStore.get(key);
        return holder.value();
    }

    public PutStatus put(K key, V value) throws StoreAccessException{
        PutStatus putStatus = dataStore.put(key, value);
        return putStatus;
    }

    public ValueHolder<V> remove(K key) throws StoreAccessException{
        ValueHolder<V> remove = dataStore.remove(key);
        return remove;
    }

    public void clear() throws StoreAccessException{
        dataStore.clear();
    }
}
