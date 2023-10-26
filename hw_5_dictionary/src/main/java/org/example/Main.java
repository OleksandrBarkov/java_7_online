package org.example;

import java.util.*;

public class Main<K, V> {
    private Hashtable<K, V> dictionary;

    public int size() {
        return dictionary.size();
    }

    public boolean isEmpty() {
        return dictionary.isEmpty();
    }

    public boolean containsKey(K key) {
        return dictionary.containsKey(key);
    }

    public boolean containsValue(V value) {
        return dictionary.contains(value);
    }

    public V get(K key) {
        return dictionary.get(key);
    }

    public boolean put(K key, V value) {
        if (key != null && value != null) {
            dictionary.put(key, value);
            return true;
        }
        return false;
    }

    public boolean remove(K key) {
        return dictionary.remove(key) != null;
    }

    public boolean putAll(CustomDictionary<K, V> otherDictionary) {
        if (otherDictionary != null) {
            dictionary.putAll(otherDictionary.getDictionary());
            return true;
        }
        return false;
    }

    public boolean clear() {
        dictionary.clear();
        return true;
    }

    public Set<K> keySet() {
        return dictionary.keySet();
    }

    public Collection<V> values() {
        return dictionary.values();
    }

    private Hashtable<K, V> getDictionary() {
        return dictionary;
    }
}
