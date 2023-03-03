package no.obrien.dsaa.datastructures.collections.dictionaries;

public interface Map<K, V> {

  int size();

  boolean isEmpty();

  boolean containsKey(Object key);

  boolean containsValue(Object value);

  V get(Object key);

  V put(K key, V value);

  V remove(Object key);

  void putAll(java.util.Map<? extends K, ? extends V> m);

  void clear();
}
