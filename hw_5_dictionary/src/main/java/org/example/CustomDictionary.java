package org.example;

import java.util.Hashtable;
import java.util.Map;

public class CustomDictionary<K, V> {
    public void CustomDictionary() {
        Hashtable<Object, Object> dictionary = new Hashtable<>();
    }

    public <V, K> Map<? extends K,? extends V> getDictionary() {
        Map<? extends K, ? extends V> dictionary = null;
        return dictionary;
    }
}
