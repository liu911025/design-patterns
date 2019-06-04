package com.design.patterns.designpatterns.iterator;

public class NetEaseMusic {

    private IList songList;
    public NetEaseMusic() {
        songList = new SongList(3);
        songList.add(new Song("让我留在你身边", "陈奕迅"));
        songList.add(new Song("你曾是少年", "SHE"));
        songList.add(new Song("Perfect", "Ed Sheeran"));
    }

    /**
     * 列表循环
     */
    public void listenToMusicByLoop() {
        IIterator iterator = songList.iterator();
        while (iterator.hasNext()) {
            System.out.println("听歌：" + ((ISong)iterator.next()).getSongInfo());
        }
    }

}
