/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trejop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author publico
 */
@RestController
public class MainController {
    @GetMapping({"/","/home"})
    public ModelAndView home(){
        return new ModelAndView("index");
    }
}
