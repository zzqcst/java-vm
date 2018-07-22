package com.zhi;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    /**
     * java堆内存溢出异常测试
     */
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
