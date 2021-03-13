package com.nowcoder.controller;

import com.nowcoder.entity.DiscussPost;
import com.nowcoder.entity.Page;
import com.nowcoder.service.DiscussPostService;
import com.nowcoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {
    @Autowired
    private DiscussPostService discussPostService;
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/index")
    public String getIndexPage(Model model, Page page){
        page.setRows(discussPostService.findDiscussPostRows(0));
        page.setPath("/index");
        List<DiscussPost> list = discussPostService.findDiscussPost(0,page.getOffset(),page.getLimit());
        List<Map<String,Object>> mapList = new ArrayList<>();
        if(list != null){
            for(DiscussPost discussPost : list){
                Map<String,Object> map = new HashMap<String,Object>();
                map.put("discussPost",discussPost);
                map.put("user",userService.findUserById(discussPost.getUserId()));
                mapList.add(map);
            }
        }
        model.addAttribute("mapList",mapList);
        return "/index";
    }
}
