package com.store.bai2;

public class Bai2 {

    public static void main(String[] args) {

        MediaPlayer player = new MediaAdapter();

        player.play("vlc", "movie.vlc");

    }
}


interface MediaPlayer {
    void play(String audioType, String fileName);
}


class VlcPlayer {

    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

}


class MediaAdapter implements MediaPlayer {

    private final VlcPlayer vlcPlayer;

    public MediaAdapter() {
        vlcPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        } else {
            System.out.println("Định dạng không hỗ trợ");
        }

    }

}