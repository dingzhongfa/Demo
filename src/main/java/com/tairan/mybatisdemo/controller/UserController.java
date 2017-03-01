package com.tairan.mybatisdemo.controller;


import com.tairan.mybatisdemo.model.User;
import com.tairan.mybatisdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.FormSubmitEvent;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by hzdzf on 2016/11/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;


    /**
     * 用于自动加载列表
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/listAll")
    public List<User> getUserInfos() {
        List<User> users = userService.getUser();
        for(User u:users){
            System.out.println(u);
        }
        return users;
    }

    @RequestMapping(value = "/insert")
    public String insertUser(User user){

        userService.insert(user);
        return "/user/list";
    }

//    修改名字和年龄
    @RequestMapping(value = "/edit")
    public String updateName(User user){
        userService.update(user);
        return "/user/list";
    }

    @RequestMapping("/combineQuery/{path}")
    public String combineQuery( User user){

        return null;
    }

    @ResponseBody
    @RequestMapping(value = "/delete")
    public String deleteUser(int id){
        userService.delete(id);
        return "删除成功";
    }

    @RequestMapping("/addView")
    public String addView(){
        return "/user/add";
    }

    /**
     * 登录
     * @param user
     * @param modelMap
     * @return
     */
    @RequestMapping("/login")
    public String login(User user, ModelMap modelMap){
        //若有一格没输入则不查询
        if (user.getId()==null||user.getPassword()==null){
            request.setAttribute("message","请输入用户和密码");
            return "/login";
        }
        User selectedUser = userService.getById(user.getId());
        if (selectedUser==null){
            request.setAttribute("message","对不起，用户不存在，请重新输入");
            return "/login";
        }
        if (selectedUser.getPassword().equals(user.getPassword())){
            request.getSession().setAttribute("user",selectedUser);
//           modelMap.addAttribute("user",selectedUser);
            return "user/list";
        }else {
            request.setAttribute("message","对不起，密码输入错误");
            return "/login";
        }
    }
}
