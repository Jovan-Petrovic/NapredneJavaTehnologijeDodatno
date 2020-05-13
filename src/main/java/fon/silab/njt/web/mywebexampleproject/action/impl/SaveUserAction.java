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
public class SaveUserAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
        String username=request.getParameter("username");
        String firstname=request.getParameter("firstname");
        String lastname=request.getParameter("lastname");
        String password=request.getParameter("password");
        
        User user= new User(firstname, lastname, username, password);
        List<User> users = (List<User>) request.getServletContext().getAttribute("users");
        if (users.contains(user)){
            request.setAttribute("message", "User already exist with that username!");
        }else{
            users.add(user);
            request.setAttribute("message", "User is saved!");
        }
        return PageConstants.VIEW_ADD_USER;
    }
    
}
