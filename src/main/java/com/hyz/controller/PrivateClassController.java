package com.hyz.controller;


import com.hyz.pojo.*;
import com.hyz.service.PrivateClassOrderService;
import com.hyz.service.PrivateClassTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/privateClass")
public class PrivateClassController {

    @Autowired
    private PrivateClassTableService privateClassTableService;
    @Autowired
    private PrivateClassOrderService privateClassOrderService;



    @RequestMapping("/toUserPrivateClass")
    public String toUserPrivateClass(Model model){
        List<PrivateClassTable> privateClassTableList=privateClassTableService.findAll();
        model.addAttribute("privateClassTableList",privateClassTableList);
        return "userSelectPrivateClass";
    }



    //跳转我的课程页面
    @RequestMapping("/toAddPrivateClass")
    public String userApplyClass(Integer classId, Model model, HttpSession session) {
        PrivateClassTable privateClassTable = privateClassTableService.selectByClassId(classId);
        System.out.println(privateClassTable+"aaaaaaaaaaaaaaaaaaaaaa");
        Member member = (Member) session.getAttribute("user");
        Integer classId1 = privateClassTable.getClassId();
        System.out.println(classId1+"111");
        String className = privateClassTable.getClassName();
        System.out.println(className+"222");
        String coach = privateClassTable.getCoach();
        System.out.println(coach+"333");
        String memberName = member.getMemberName();
        System.out.println(memberName+"444");
        Integer memberAccount = member.getMemberAccount();
        System.out.println(memberAccount+"5555");

        PrivateClassOrder privateClassOrder = new PrivateClassOrder(classId1, className, coach, memberName, memberAccount);
        System.out.println(privateClassOrder);
        Integer memberAccount1 = member.getMemberAccount();
        PrivateClassOrder privateClassOrder1  =privateClassOrderService.selectMemberByClassIdAndMemberAccount(classId1,memberAccount1);
        System.out.println(privateClassOrder1);
        System.out.println(privateClassOrder+"bbbbbbbbbbbb");
        System.out.println("666");
        if (privateClassOrder1 == null) {
            privateClassOrderService.insertClassOrder(privateClassOrder);
        }

        return "redirect:/privateClass/toPrivateClass";
    }

    //跳转我的课程页面
    @RequestMapping("/toPrivateClass")
    public String toUserClass(Model model, HttpSession session) {
        Member member = (Member) session.getAttribute("user");
        System.out.println(member);
        System.out.println("+++++++++++++");
        model.addAttribute("member", member);
        Integer memberAccount = member.getMemberAccount();
        System.out.println(memberAccount+"***********************");
        List<PrivateClassOrder> privateClassOrderList = privateClassOrderService.selectClassOrderByMemberAccount(memberAccount);
        for (PrivateClassOrder p:privateClassOrderList) {
            System.out.println(p+"////");
        }
        model.addAttribute("privateClassOrderList", privateClassOrderList);
        return "userShowPrivateClass";
    }

    //在admin端展示私教课课程
    @RequestMapping("/toAdminPrivateClass")
    public String toAdminPrivateClass(Model model){
        List<PrivateClassTable> privateClassTableLists=privateClassTableService.findAll();
        model.addAttribute("privateClassTableLists",privateClassTableLists);
        return "adminPrivateClass";
    }


    @RequestMapping("/toSelectPrivateClassOrder")
    public String toSelectPrivateClassOrder(Integer classId, Model model) {
        List<PrivateClassOrder> privateClassOrderList = privateClassOrderService.selectMemberOrderList(classId);
        model.addAttribute("privateClassOrderList", privateClassOrderList);
        return "selectPrivateClassOrder";
    }

    //跳转到admin端添加私教课程的页面，这个是作为中转站直接挑
    @RequestMapping("/toAddAdminPrivateClassPage")
    public String toAddAdminPrivateClassPage(){
        return "addAdminPrivateClass";
    }


    //这个是增加课程的功能,然后返回到私教课主页
    @RequestMapping("/addAdminPrivateClass")
    public String addAdminPrivateClass(PrivateClassTable privateClassTable){
        privateClassTableService.insertClass(privateClassTable);
        return "redirect:toAdminPrivateClass";
    }

}
