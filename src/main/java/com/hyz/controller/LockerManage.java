package com.hyz.controller;

import com.hyz.pojo.Locker;
import com.hyz.pojo.Member;
import com.hyz.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/locker")
public class LockerManage {

    @Autowired
    LockerService lockerService;

    //去储物柜管理页面
    @RequestMapping("toLockerManage")
    public String lockerManage(){
        return "LockerManage";
    }

    /**
     *     跳转到增加储物柜使用者页面
     */

    @RequestMapping("toAddLockerMember")
    public String toAddLockerMember(){

        return "addLockerMember";
    }

    //去到储物柜使用者信息页面
    @RequestMapping("toLockerInformation")
    public String toLockerInformation(Model model,@RequestParam(value = "lockerNumberId") Integer lockerNumberId){
       Locker locker = lockerService.getInfoByMemberId(lockerNumberId);
       model.addAttribute("memberAccount",locker.getMemberAccount());
        model.addAttribute("lockerNumber",locker.getLockerNumber());
        model.addAttribute("lockerStatus",locker.getLockerStatus());
        return "LockerInformation";
    }


    /**
     *  修改储物柜状态
     * @param memberAccount
     * @param lockerNumberId
     * @return
     */
    @RequestMapping("addLockerMember")
    public String addLockerMember(@RequestParam(value = "memberAccount") Integer memberAccount,
                                  @RequestParam(value = "lockerNumberId") Integer lockerNumberId,
                                  Model model){
        System.out.println(lockerNumberId);
        List<Locker> lists = lockerService.getAll();
        model.addAttribute("lists", lists);
        lockerService.updateLockerStatusByMemberAccount(memberAccount,lockerNumberId);
        return "1";
    }

    /**
     * 归还储物柜
     * @param lockerNumberId 盒子ID
     * @return
     */
    @RequestMapping("returnBox")
    public String returnBox(@RequestParam(value = "lockerNumberId") Integer lockerNumberId){
        System.out.println(lockerNumberId);
        lockerService.resetBox(lockerNumberId);
        return "LockerManage";
    }
    @RequestMapping("getAllBox")
    public String getAllBox(Model model){
        List<Locker> lists = lockerService.getAll();
        model.addAttribute("lists", lists);
        return "LockerManage";
    }
}
