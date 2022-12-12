package com.hyz.service.impl;

import com.hyz.mapper.VideoMapper;
import com.hyz.pojo.Video;
import com.hyz.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoMapper videoMapper;
    @Override
    public List<Video> getAll() {
        return videoMapper.getAll();
    }

    @Override
    public List<Video> selectByVideoId(Integer videoId) {
        return videoMapper.selectByVideoId(videoId);
    }

    @Override
    public Boolean updateVideoById(Integer videoId, String videoSrcName) {
        return videoMapper.updateVideoById(videoId,videoSrcName);
    }


}
