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
public class LogoutAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
        request.getSession().invalidate();
        request.setAttribute("message", "User success logout!");
        return PageConstants.VIEW_LOGIN;
    }

}
