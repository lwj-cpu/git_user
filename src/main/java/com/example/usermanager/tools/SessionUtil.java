package com.example.usermanager.tools;

import com.example.usermanager.model.UserInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtil {
    /**
     * 获取session中的用户对象
     * @param request
     * @return
     */
    public  static UserInfo getUserBySession(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        UserInfo userInfo = null;
        if(session!=null &&
                (userInfo = (UserInfo) session.getAttribute(AppFinal.USERINFO_SESSION_KEY))!=null){
        }
        return userInfo;
    }
}
