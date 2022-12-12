package com.hyz.mapper;

import com.hyz.pojo.Video;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VideoMapper {
    List<Video> getAll();

    List<Video> selectByVideoId(Integer video);

    Boolean updateVideoById(@Param("video") Integer videoId,@Param("videoSrcName") String videoSrcName);

}
