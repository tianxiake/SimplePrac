package com.snail.test.linked;

public class SingleLinkedList<E> {

    private Entry<E> headEntry;
    private Entry<E> endEntry;
    private int size = 0;

    public SingleLinkedList() {
        headEntry = new Entry<>();
        headEntry.setData(null);
        headEntry.setNextEntry(null);
        endEntry = headEntry;
    }

    public int size() {
        return size;
    }

    /**
     * 尾插入（ 遍历查找） 这样每次插入的复杂度变成了O（n）
     */
    public void add(E e) {
        Entry<E> entry = new Entry();
        entry.setData(e);
        entry.setNextEntry(null);
        endEntry.setNextEntry(entry);
        endEntry = entry;
//        Entry endEntry = headEntry;
//        while (endEntry.getNextEntry() != null) {
//            endEntry = endEntry.getNextEntry();
//        }
//        endEntry.setNextEntry(entry);
        size++;
    }

    public boolean insert(int position, E e) {
        if (position < 0 || position > size - 1) {
            return false;
        }
        Entry<E> newEntry = new Entry<>();
        newEntry.setData(e);

        Entry<E> preEntry = headEntry;
        Entry<E> nextEntry = headEntry.getNextEntry();
        for (int i = 0; i < position; i++) {
            preEntry = nextEntry;
            Entry<E> entry = nextEntry.getNextEntry();
            nextEntry = entry;
        }
        preEntry.setNextEntry(newEntry);
        newEntry.setNextEntry(nextEntry);
        size++;
        return true;
    }

    public boolean remvoe(int position) {
        if (position > size - 1 || position < 0) {
            return false;
        }
        Entry preEntry = headEntry;
        Entry nextEntry = headEntry.getNextEntry();
        for (int i = 0; i < position; i++) {
            preEntry = nextEntry;
            nextEntry = nextEntry.getNextEntry();
        }
        preEntry.setNextEntry(nextEntry.getNextEntry());
        nextEntry.setNextEntry(null);
        size--;
        return true;
    }

    public boolean isEmpty() {
        return headEntry.getNextEntry() == null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SingleLinkedList{");
        Entry<E> nextEntry = headEntry.getNextEntry();
        while (nextEntry != null) {
            sb.append(nextEntry.getData()).append(" ,");
            nextEntry = nextEntry.getNextEntry();
        }
        sb.append('}');
        return sb.toString();
    }

    public static class Entry<E> {
        private Entry<E> nextEntry;
        private E data;

        public Entry<E> getNextEntry() {
            return nextEntry;
        }

        public void setNextEntry(Entry<E> nextEntry) {
            this.nextEntry = nextEntry;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Entry{");
            sb.append("nextEntry=").append(nextEntry);
            sb.append(", data=").append(data);
            sb.append('}');
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.add("a");
        singleLinkedList.add("b");
        singleLinkedList.add("c");
        System.out.println(singleLinkedList);

        singleLinkedList.insert(0, "e");
        singleLinkedList.insert(1, "dd");
        singleLinkedList.insert(singleLinkedList.size - 1, "f");
        System.out.println(singleLinkedList);

        System.out.println("size:" + singleLinkedList.size());

        singleLinkedList.remvoe(0);
        System.out.println(singleLinkedList);

        singleLinkedList.remvoe(-1);
        System.out.println(singleLinkedList);

        singleLinkedList.remvoe(singleLinkedList.size);
        System.out.println(singleLinkedList);

        singleLinkedList.remvoe(3);
        System.out.println(singleLinkedList);
    }
}
