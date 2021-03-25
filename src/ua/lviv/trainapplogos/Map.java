package ua.lviv.trainapplogos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Map <K, V> {
	private Set<MyEntry <K, V>> list = new HashSet();
	
	public Map() {
		super();
	}

	public Set<MyEntry<K, V>> getList() {
		return list;
	}

	public void setList(Set<MyEntry<K, V>> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Map other = (Map) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}
	
	public void AddItem(K key, V value) {
		if (!this.list.add(new MyEntry(key, value))) {
			System.out.println("Can't add value! The key " + key + " is already present!");
		}
	}
	
	public void RemoveByKey(K key) {
		for (MyEntry<K, V> myEntry : this.list) {
			if (myEntry.key.equals(key)) {
				this.list.remove(myEntry);
				return;
			}
		}
	}
	
	public void RemoveByValue(V value) {
		Iterator<MyEntry<K, V>> iterator = this.list.iterator();
		while (iterator.hasNext()) {
			MyEntry<K, V> next = iterator.next();
			if (next.value.equals(value)) iterator.remove();
		}	
	}
	
	public void OutputKeys() {
		for (MyEntry<K, V> myEntry : list) {
			System.out.println(myEntry.getKey());
		}
	}
	
	public void OutputValues() {
		for (MyEntry<K, V> myEntry : list) {
			System.out.println(myEntry.getValue());
		}
	}
	
	public void OutputMap() {
		int ind = 1;
		for (MyEntry<K, V> myEntry : list) {
			System.out.println(ind + ") " + myEntry);
			ind++;
		}
	}

}

class MyEntry <K, V>  {
	K key;
	V value;
	
	public MyEntry() {
		super();
	}
	
	public MyEntry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyEntry other = (MyEntry) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyEntry [key=" + key + ", value=" + value + "]";
	}
	
}
