package com.minimals.newOps.Interproc;

public class CipherPack {
    private String propertyName = "AES/GCM/NoPadding";
    public CipherPack A0(){
        propertyName = "AES/GCM/NoPadding";
        return this;
    }
    public CipherPack A1(){
        propertyName = "AES/GCM/NoPadding";
        return this;
    }
    public CipherPack A2(){
        propertyName = "AES/GCM/NoPadding";
        return this;
    }
    public CipherPack B(){
        propertyName = "AES";
        return this;
    }
    public String getpropertyName(){
        return propertyName;
    }
    
}
