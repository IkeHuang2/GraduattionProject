package com.hyz.service;

import com.hyz.pojo.Video;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;

public interface VideoService {
    List<Video> getAll();

    List<Video> selectByVideoId(Integer videoId);

    Boolean updateVideoById(Integer videoId,String videoSrcName);
}
