package com.minimals.newOps.InterprocNestedConditionals.NestedConditional4;

public class CipherPack {
    private String propertyName = "AES/GCM/NoPadding";
    private int n = 0;
    public CipherPack A(){
    if (n == 0) {
        if (n == 0) {
            if (n == 0) {
                if (n == 0) {
                    propertyName = "AES";
                }
                else {
                    propertyName = "AES/GCM/NoPadding";
                }
            }
            else {
                propertyName = "AES/GCM/NoPadding";
            }
        }
        else {
            propertyName = "AES/GCM/NoPadding";
        }
    }
    else {
        propertyName = "AES/GCM/NoPadding";
    }
        return this;
    }
    public String getpropertyName(){
        return propertyName;
    }
}
