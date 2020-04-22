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
public class AddUserAction extends AbstractAction{

    @Override
    public String execute(HttpServletRequest request) {
        //vrati stranicu za dodavanje
        return PageConstants.VIEW_ADD_USER;
    }
    
}
