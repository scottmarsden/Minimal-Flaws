package com.minimals.newOps.StaticKeystore;

public class Static {
    public static void main(java.lang.String[] args) {
        java.lang.System.out.println("Hello");
        byte[] cryptoTemp = "12345678".getBytes();
        javax.crypto.spec.IvParameterSpec ivSpec = new javax.crypto.spec.IvParameterSpec(cryptoTemp,0,8);
      }
    
}
