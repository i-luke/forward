package com.luke.json;

import com.luke.json.toobject.symbolType;
import org.junit.Test;

/**
 * Created by yangf on 2017/3/30.
 */
public class TestObj {


    @Test
    public void test(){
        String aa = "'";
        System.out.println(symbolType.DY.equal(aa.charAt(0)));
    }
}
