package com.iamnotgay.cscache.store;

/**
 * @author zhangyongchao[sanmao]
 * 2018/3/5
 **/
public enum  PutStatus {
    PUT("Success",1);

    private String desc;
    private int status;

    PutStatus() {
    }

    PutStatus(String desc, int status) {
        this.desc = desc;
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
