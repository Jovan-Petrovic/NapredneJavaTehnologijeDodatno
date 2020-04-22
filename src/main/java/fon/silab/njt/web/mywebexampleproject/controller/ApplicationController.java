/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.mywebexampleproject.controller;

import fon.silab.njt.web.mywebexampleproject.action.AbstractAction;
import fon.silab.njt.web.mywebexampleproject.action.factory.ActionFactory;
import fon.silab.njt.web.mywebexampleproject.constants.PageConstants;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author KORISNIK
 */
public class ApplicationController {

    public String processRequest(String pathInfo, HttpServletRequest request) {
        String nextPage = PageConstants.VIEW_DEFAULT_ERROR;
        
        AbstractAction action = ActionFactory.createActionFactory(pathInfo);
        if (action != null) {
            nextPage = action.execute(request);
        }
        
        return nextPage;
    }
    
}
