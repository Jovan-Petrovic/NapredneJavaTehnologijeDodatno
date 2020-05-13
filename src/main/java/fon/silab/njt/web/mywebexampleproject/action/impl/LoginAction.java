/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.mywebexampleproject.action.impl;

import fon.silab.njt.web.mywebexampleproject.action.AbstractAction;
import fon.silab.njt.web.mywebexampleproject.constants.PageConstants;
import fon.silab.njt.web.mywebexampleproject.model.User;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

/**
 *
 * @author KORISNIK
 */
@Component
public class LoginAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        System.out.println("====================================================");
        System.out.println("====================LoginAction=====================");
        System.out.println(username+"\t"+password);
        System.out.println("====================================================");
        
        //proveri da li postoji
        User user=findUser(request, username);
        if (user==null){
            request.setAttribute("message", "User does not exist!");
             return PageConstants.VIEW_LOGIN;
        }else{
            //korisnik postoji
            request.getSession(true).setAttribute("loginUser", user);
            return PageConstants.VIEW_HOME;
        }
    }

    private User findUser(HttpServletRequest request, String username) {
        List<User> users = (List<User>) request.getServletContext().getAttribute("users");
        for (User user : users) {
            if (user.getUsername().equals(username)) return user;
        }
        return null;
    }
    
}
