package com.design.patterns.designpatterns.iterator;

public class SongList implements IList {

    private ISong[] songs;
    private int index;
    private int size;

    public SongList(int size) {
        this.songs = new ISong[size];
        this.size = 0;
        this.index = 0;
    }

    @Override
    public IIterator iterator() {
        return new IteratorImpl(this);
    }

    @Override
    public void add(Object obj) {
        if (index >= songs.length)
            throw new IndexOutOfBoundsException("索引越界");
        songs[index++] = (Song) obj;
        size++;
    }

    @Override
    public Object get(int index) {
        if (index < this.size) {
            return songs[index];
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
}
