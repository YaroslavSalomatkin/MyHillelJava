package MyHashMap;

import java.util.*;

public class MyHashMap<K, V> implements Map {
    private LinkedList<Entry>[] table;
    private int capacity = 16;
    private double loadFactor = 0.75;
    private int threshold;
    private int size;

    public MyHashMap() {
        this.table = new LinkedList[capacity];
    }

    private int getHashBucket(Object key) {
        return Math.abs(key.hashCode() % capacity);
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        for (LinkedList linkedList : table) {
            if (linkedList != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean containsKey(Object key) {
        int bucket = getHashBucket(key);
        if (table[bucket] == null) {
            return false;
        } else {
            for (Entry entry : table[bucket]) {
                if (entry.getKey().equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (LinkedList<Entry> linkedList : table) {
            for (Entry entry : linkedList) {
                if (entry.getValue().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object get(Object key) {
        int bucket = getHashBucket(key);
        if (table[bucket] == null) {
            return null;
        } else {
            for (Entry entry : table[bucket]) {
                if (entry.getKey().equals(key)) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public V put(Object key, Object value) {
        int bucket = getHashBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new LinkedList<>();
            table[bucket].add(new Entry(key, value));
            size++;
        } else {
            if (!this.containsKey(key)) {
                table[bucket].add(new Entry(key, value));
                size++;
            } else {
                for (Entry entry : table[bucket]) {
                    if (entry.getKey().equals(key)) {
                        entry.setValue(value);
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public Object remove(Object key) {
        int bucket = getHashBucket(key);
        if (!this.containsKey(key)) {
            return null;
        } else {
            for (Entry entry : table[bucket]) {
                if (entry.getKey().equals(key)) {
                    table[bucket].remove(entry);
                    size--;
                }
            }
        }
        return null;
    }

    @Override
    public void putAll(Map m) {
        for (Object object : m.entrySet()) {
            this.put(((Entry) object).getKey(), ((Entry) object).getValue());
            size++;
        }
    }

    @Override
    public void clear() {
        for (LinkedList linkedList : table) {
            linkedList = null;
        }
        size = 0;
    }

    @Override
    public Set keySet() {
        HashSet<K> keySet = new HashSet<K>();
        for (LinkedList<Entry> linkedList : table) {
            if (linkedList != null) {
                for (Entry entry : linkedList) {
                    keySet.add((K) entry.getKey());
                }
            }
        }
        return keySet;
    }

    @Override
    public Collection values() {
        HashSet<V> valueSet = new HashSet<V>();
        for (LinkedList<Entry> linkedList : table) {
            if (linkedList != null) {
                for (Entry entry : linkedList) {
                    valueSet.add((V) entry.getValue());
                }
            }
        }
        return valueSet;
    }

    @Override
    public Set<Entry> entrySet() {
        HashSet entrySet = new HashSet();
        for (LinkedList<Entry> linkedList : table) {
            if (linkedList != null) {
                for (Entry entry : linkedList) {
                    entrySet.add(entry);
                }
            }
        }

        return entrySet;
    }

    private static class Entry<K, V> {
        private K key;
        private V value;

        public Entry(Object key, Object value) {
            this.key = (K) key;
            this.value = (V) value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public void setKey(K key) {
            this.key = key;
        }
    }
}
