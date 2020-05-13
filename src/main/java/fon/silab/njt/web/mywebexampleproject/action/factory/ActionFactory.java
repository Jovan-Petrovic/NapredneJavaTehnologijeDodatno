/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.mywebexampleproject.action.factory;

import fon.silab.njt.web.mywebexampleproject.action.AbstractAction;
import fon.silab.njt.web.mywebexampleproject.action.impl.AddUserAction;
import fon.silab.njt.web.mywebexampleproject.action.impl.AllUsersAction;
import fon.silab.njt.web.mywebexampleproject.action.impl.LoginAction;
import fon.silab.njt.web.mywebexampleproject.action.impl.SaveUserAction;
import fon.silab.njt.web.mywebexampleproject.constants.ActionConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author KORISNIK
 */
@Component
public class ActionFactory {
    
    @Autowired
    private AbstractAction loginAction;
    @Autowired
    private AbstractAction allUsersAction;
    @Autowired
    private AbstractAction addUserAction;
    @Autowired
    private AbstractAction saveUserAction;
    @Autowired
    private AbstractAction logoutAction;
    
    public AbstractAction createActionFactory(String actionName) {
        AbstractAction action = null;
        if (actionName.equals(ActionConstants.URL_LOGIN)) {
            action = loginAction;
        }
        if (actionName.equals(ActionConstants.URL_ALL_USERS)) {
            action = allUsersAction;
        }
        if (actionName.equals(ActionConstants.URL_ADD_USER)) {
            action = addUserAction;
        }
        if (actionName.equals(ActionConstants.URL_SAVE_USER)) {
            action = saveUserAction;
        }
        if (actionName.equals(ActionConstants.URL_LOGOUT)) {
            action = logoutAction;
        }
        return action;
    }
}
