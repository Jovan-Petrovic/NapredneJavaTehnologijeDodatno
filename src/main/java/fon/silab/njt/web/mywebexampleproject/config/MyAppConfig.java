/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.web.mywebexampleproject.config;

import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author KORISNIK
 */
@ComponentScan(basePackages = {
    "fon.silab.njt.web.mywebexampleproject.controller",
    "fon.silab.njt.web.mywebexampleproject.viewresolver",
    "fon.silab.njt.web.mywebexampleproject.action"
})
public class MyAppConfig {
    
}
