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
import fon.silab.njt.web.mywebexampleproject.constants.ActionConstants;

/**
 *
 * @author KORISNIK
 */
public class ActionFactory {
    public static AbstractAction createActionFactory(String actionName) {
        AbstractAction action = null;
        if (actionName.equals(ActionConstants.URL_LOGIN)) {
            action = new LoginAction();
        }
        if (actionName.equals(ActionConstants.URL_ALL_USERS)) {
            action = new AllUsersAction();
        }
        if (actionName.equals(ActionConstants.URL_ADD_USER)) {
            action = new AddUserAction();
        }
        return action;
    }
}
