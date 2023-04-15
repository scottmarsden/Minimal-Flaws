package com.minimals.newOps.InterprocBaseCaseConditional;

public class CipherPack {
    private String propertyName = "AES/GCM/NoPadding";
    private int x = 1;
    public CipherPack A(){
        if (x == 1) {
        propertyName = "AES/GCM/NoPadding";
        return this;
        }
        else {
        propertyName = "AES";
        return this;
        }
    }
    public int changeX(){
        x = 0;
        return x;
    }
    public String getpropertyName(){
        return propertyName;
    }
    
}
