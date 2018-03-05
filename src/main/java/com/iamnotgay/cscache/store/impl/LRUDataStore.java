package com.iamnotgay.cscache.store.impl;

import com.iamnotgay.cscache.store.DataStore;
import com.iamnotgay.cscache.store.PutStatus;
import com.iamnotgay.cscache.store.StoreAccessException;
import com.iamnotgay.cscache.store.ValueHolder;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangyongchao[sanmao]
 * 2018/3/5
 **/
public class LRUDataStore<K,V> implements DataStore<K,V> {

    ConcurrentHashMap<K,ValueHolder<V>> map = new ConcurrentHashMap<K, ValueHolder<V>>();

    @Override
    public ValueHolder<V> get(K key) throws StoreAccessException {
        return null;
    }

    @Override
    public PutStatus put(K key, V value) throws StoreAccessException {
        return null;
    }

    @Override
    public ValueHolder<V> remove(K key) throws StoreAccessException {
        return null;
    }

    @Override
    public void clear() throws StoreAccessException {

    }
}
