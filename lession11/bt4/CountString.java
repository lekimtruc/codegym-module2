package lession11.bt4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountString<K, V> {

    private Map<K, V> map;

    public CountString() {
        map = new TreeMap<>();
    }

    public void put(K key, V value){
        map.put(key, value);
    }

    public boolean constainsKey(K key){
        return map.containsKey(key);
    }

    public V get(K key){
        return map.get(key);
    }

    public Set<Map.Entry<K, V>> entrySet(){
        return map.entrySet();
    }
}
