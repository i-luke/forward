package com.luke.json;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yangf on 2017/3/30.
 */
public class JsonTest {
    @Test
    public void testJSON(){

        A a = new A();
        a.setAge(23);
        a.setName("小米");
        a.setClasses("B班");
        A.C c = new A.C();
        a.setC(c);
        c.setClientNo("1111111111");


        Map<String, Object> map = new HashMap<>();
        map.put("123", "\r\n123\n");
        map.put("345", 23);
        map.put("23", new boolean[]{true, false, true});
        map.put("678", new int[]{1,2,3});
        map.put("bb", a);

        List list = new ArrayList();
        list.add(a);

        map.put("list", list);
        System.out.println(JSON.toJsonString(map));
    }
}


class A extends B{
    private String name;
    private int age;
    private C c;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }

    static class C{
        private String clientNo;

        public String getClientNo() {
            return clientNo;
        }

        public void setClientNo(String clientNo) {
            this.clientNo = clientNo;
        }
    }
}

class B{
    private String classes;
    private String number;

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }


    public String queryClasses() {
        return classes;
    }
}