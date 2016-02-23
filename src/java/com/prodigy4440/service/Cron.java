/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.service;

import java.util.Date;
import javax.ejb.Asynchronous;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author prodigy4440
 */
@Asynchronous
@Stateless
public class Cron {

  private final Logger LOG = LoggerFactory.getLogger(Cron.class);
  
  @Inject
  private Service service;

  @Schedule(year = "*", month = "*", hour = "*", minute = "*/3")
  public void everyTwoMinutes() {
    LOG.info("Starting cron service : "+new Date());
    service.migrate();
  }

}
