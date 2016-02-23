/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.service;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author prodigy4440
 */
@Singleton
@Startup
public class StartupHook {

  @EJB
  private Service service;

  @PostConstruct
  public void init() {
    service.populateJsonPaths();
  }

}
