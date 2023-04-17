package com.collection.demo.service.impl;

import com.collection.demo.service.CollectionsService;

import java.util.*;

public class CollectionsServiceImpl implements CollectionsService {
    //数组
    private Test[] tests;
    private int[] arr;
    //list
    private List<String> list;
    //set
    private Set<String> set;
    //hash
    private Map<String, String> map;
    //properties
    private Properties properties;

    @Override
    public String toString() {
        return "CollectionsServiceImpl{" +
                "\narr=" + Arrays.toString(arr) +
                "\n, list=" + list +
                "\n, set=" + set +
                "\n, map=" + map +
                "\n, properties=" + properties +
                "\n}";
    }

    public Test[] getTests() {
        return tests;
    }

    public void setTests(Test[] tests) {
        this.tests = tests;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public int[] getArr() {
        return arr;
    }

    public List<String> getList() {
        return list;
    }

    public Set<String> getSet() {
        return set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public Properties getProperties() {
        return properties;
    }

    @Override
    public void service() {
        System.out.println("查看数组1：");
        System.out.println(Arrays.toString(arr));
        System.out.println("查看数组2：");
        System.out.println(Arrays.toString(tests));
        System.out.println("查看list:");
        System.out.println(list);
        System.out.println("查看set:");
        System.out.println(set);
        System.out.println("查看map:");
        System.out.println(map);
        System.out.println("查看property:");
        System.out.println(properties.toString());
    }
}
