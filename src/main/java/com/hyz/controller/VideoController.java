package com.hyz.controller;

import com.hyz.pojo.Video;
import com.hyz.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/video")
public class VideoController {
    @Autowired
    private VideoService videoService;




    @RequestMapping("/updateVideoById")
    public String updateVideoById(Integer videoId,String videoSrcName){
        videoService.updateVideoById(videoId,videoSrcName);
        return "redirect:getAllVideo";
    }


    /**
     * 遍历video所有属性，将时评展示在页面
     * @param model
     * @return
     */
    @RequestMapping("getAllVideo")
    public String getAllVideo(Model model){
        List<Video> listVideo = videoService.getAll();
        model.addAttribute("listVideo",listVideo);
        return "adminVideoPage";
    }

    /**
     * 跳转修改视频页面
     * @param
     * @return
     */
    @RequestMapping("toUpdateVideo")
    public String updateVideo(Integer videoId,Model model){
        List<Video> videoList=videoService.selectByVideoId(videoId);
        model.addAttribute("videoList",videoList);
        System.out.println(1);
        return "updateVideo";
    }

}
