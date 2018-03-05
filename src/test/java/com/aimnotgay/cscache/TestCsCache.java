package com.aimnotgay.cscache;

import com.iamnotgay.cscache.CsCache;
import com.iamnotgay.cscache.store.StoreAccessException;
import com.iamnotgay.cscache.store.impl.WeakValueDataStore;
import org.junit.Test;

/**
 * @author zhangyongchao[sanmao]
 * 2018/3/5
 **/
public class TestCsCache {


    @Test
    public void TestWeakValue() throws StoreAccessException,InterruptedException{
        CsCache<String,User> cache = new CsCache<String, User>(new WeakValueDataStore<String, User>());

        String key  = "sanmao";

        User user = new User();

        user.setName("sanmao2");

        cache.put(key,user);

        user = null;
        System.out.println("Hello "+cache.get(key).getName());

        System.gc();

        Thread.sleep(10000);

        System.out.println("Hello "+ cache.get(key).getName());
    }


}
class User {

    private String name;
    private String like;

    public User(String name, String like) {
        this.name = name;
        this.like = like;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
