package com.iamnotgay.cscache.store.impl;

import com.iamnotgay.cscache.store.DataStore;
import com.iamnotgay.cscache.store.PutStatus;
import com.iamnotgay.cscache.store.StoreAccessException;
import com.iamnotgay.cscache.store.ValueHolder;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangyongchao[sanmao]
 * 2018/3/5
 *
 *  dec : 使用ConcurrentHashMap实现的弱引用数据存储
 **/
public class WeakValueDataStore<K,V> implements DataStore<K,V> {

    ConcurrentHashMap<K,ValueHolder<V>> map = new ConcurrentHashMap<K, ValueHolder<V>>();


    @Override
    public ValueHolder<V> get(K key) throws StoreAccessException {
        return map.get(key);
    }
    @Override
    public PutStatus put(K key, V value) throws StoreAccessException {
        ValueHolder<V> v = new WeakValueHolder<V>(value);
        map.put(key,v);
        return PutStatus.PUT;
    }
    @Override
    public ValueHolder<V> remove(K key) throws StoreAccessException {
        return map.remove(key);
    }
    @Override
    public void clear() throws StoreAccessException {
        map.clear();
    }
}
