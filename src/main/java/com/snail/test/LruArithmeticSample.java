package com.snail.test;

import java.util.LinkedList;

public class LruArithmeticSample<T, E> {

    private int containerSize = 20;
    private LinkedList<Entry<T, E>> container = new LinkedList<>();

    public LruArithmeticSample(int containerSize) {
        this.containerSize = containerSize;
    }

    public LruArithmeticSample() {
    }

    public <E> E get(T inputT) {
        if (inputT == null) {
            return null;
        }
        boolean isContainKey = false;
        E value = null;
        for (int i = 0; i < container.size(); i++) {
            Entry<T, E> entry = (Entry<T, E>) container.get(i);
            T entryT = entry.getKey();
            if (entryT.equals(inputT)) {
                value = entry.getValue();
                container.add(container.get(i));
            }
        }
        return value;
    }


    public void put(T t, E e) {

    }

    protected static class Entry<T, E> {
        private T key;
        private E value;

        public T getKey() {
            return key;
        }

        public void setKey(T t) {
            this.key = t;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }
    }


}
