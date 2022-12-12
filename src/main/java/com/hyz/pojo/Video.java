package com.hyz.pojo;

public class Video {
    private String videoName;
    private Integer videoId;
    private String videoSrc;

    public Video() {
    }

    @Override
    public String toString() {
        return "Video{" +
                "videoName='" + videoName + '\'' +
                ", videoId=" + videoId +
                ", videoSrc='" + videoSrc + '\'' +
                '}';
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoSrc() {
        return videoSrc;
    }

    public void setVideoSrc(String videoSrc) {
        this.videoSrc = videoSrc;
    }

    public Video(String videoName, Integer videoId, String videoSrc) {
        this.videoName = videoName;
        this.videoId = videoId;
        this.videoSrc = videoSrc;
    }
}
