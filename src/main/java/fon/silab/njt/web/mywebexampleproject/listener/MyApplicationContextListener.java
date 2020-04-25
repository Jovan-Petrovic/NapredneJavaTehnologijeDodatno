/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.mywebexampleproject.listener;

import fon.silab.njt.web.mywebexampleproject.model.User;
import java.util.ArrayList;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Web application lifecycle listener.
 *
 * @author Dusan
 */
@WebListener
public class MyApplicationContextListener implements ServletContextListener {

    public MyApplicationContextListener() {
        System.out.println("======================================================");
        System.out.println("========= MyApplicationContextListener=================");
        System.out.println("=======================================================");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("======================================================");
        System.out.println("=========        contextInitialized  =================");
        System.out.println("=======================================================");
        //lista korisnika
        sce.getServletContext().setAttribute("users", createUsers());
        //listu korisnika koji su trenutno prijavljeni na sistem
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

    private Object createUsers() {
        return new ArrayList<User>(){
            {
                add(new User("pera","peric", "pera", "pera"));
                add(new User("sofija","sofic", "sofija", "sofija"));
                add(new User("jovan","jovanic", "jovan", "jovan"));
            }
        };
    }
}
