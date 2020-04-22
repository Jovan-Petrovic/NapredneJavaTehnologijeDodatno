/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.mywebexampleproject.action.impl;

import fon.silab.njt.web.mywebexampleproject.action.AbstractAction;
import fon.silab.njt.web.mywebexampleproject.constants.PageConstants;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author KORISNIK
 */
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
        
        //uradi ako jos nesto treba
        return PageConstants.VIEW_LOGIN;
    }
    
}
