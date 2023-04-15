package com.minimals.newOps.InterprocAddition;

public class CipherPack {
    private String propertyName = "AES/GCM/NoPadding";
    public CipherPack A(){
        propertyName = "AES/GCM/NoPadding";
        return this;
    }
    public String D(){
        return "D";
    }
    public String E(){
        return "E";
    }
    public String S(){
        return "S";
    }
    public String add(){
        propertyName = D() + E() + S();
        return propertyName;
    }
    
    
}
