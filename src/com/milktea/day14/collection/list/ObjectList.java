package com.milktea.day14.collection.list;

public class ObjectList {
	Object [] objects;
	int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object object) {  // 전달받으려면 매개변수 있어야 함
		objects[size] = object;		  // 목적지 저장소에 저장을 해야 함
		size++;
	}
	
	public Object get(int index) {  // 몇 번째인지 받아서 진행해야 하므로 매개변수 있어야 함
		return objects[index];    
	}

	public int size() {
		return size;
	}

	public void clear() {
		objects = new Object[3];
		size = 0;
	}
}
