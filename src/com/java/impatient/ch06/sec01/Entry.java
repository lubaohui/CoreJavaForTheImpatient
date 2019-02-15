package com.java.impatient.ch06.sec01;
/**
 * 
 * @ClassName Entry
 * @Description //TODO
 * @Author abao
 * @Date 2019-02-12 10:09
 * @Version 1.0
 */
public class Entry<K, V> {
    private K key;
    private V value;
    
    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey() { return key; }
    public V getValue() { return value; }
}
