package com.luke.json.toobject;

/**
 * Created by yangf on 2017/3/30.
 */
public enum symbolType {
    LZK('['),
    RZK(']'),
    LDK('{'),
    RDK('}'),
    DY('\''),
    SY('"'),
    MH(':'),
    DH(',');

    private char c;

    private symbolType(char c){
        this.c = c;
    }

    public boolean equal(char c){
        return this.c == c;
    }
}
