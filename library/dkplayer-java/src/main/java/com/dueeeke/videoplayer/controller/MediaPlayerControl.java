package com.dueeeke.videoplayer.controller;

import android.graphics.Bitmap;

public interface MediaPlayerControl {

    void start();

    void pause();

    long getDuration();

    long getCurrentPosition();

    void seekTo(long pos);

    boolean isPlaying();

    int getBufferPercentage();

    void startFullScreen();

    void stopFullScreen();

    boolean isFullScreen();

    String getTitle();

    void setMute(boolean isMute);

    boolean isMute();

    void setLock(boolean isLocked);

    void setScreenScale(int screenScale);

    void retry();

    void setSpeed(float speed);

    long getTcpSpeed();

    void refresh();

    void setMirrorRotation(boolean enable);

    Bitmap doScreenShot();
}