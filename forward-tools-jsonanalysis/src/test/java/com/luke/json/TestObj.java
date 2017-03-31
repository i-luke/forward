package com.luke.json;

import com.luke.json.toobject.WordAnaly;
import org.junit.Test;

/**
 * Created by yangf on 2017/3/30.
 */
public class TestObj {


    @Test
    public void test(){
        System.out.println(new WordAnaly("{\"qwe\":123.1, \"asd\":\"aaa\"}").getWord());
    }
}
