/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.config;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.persistence.EntityManager;

/**
 *
 * @author prodigy4440
 */
public class Months {

  List<String> months;

  private static final String START_PATH = "/home/prodigy4440/Desktop/raw/jsons/";

  public Months() {
    months = new LinkedList<>();
    months.add("JANUARY_2016");
    months.add("DECEMBER_2015");
    months.add("NOVEMBER_2015");
    months.add("OCTOBER_2015");
    months.add("SEPTEMBER_2015");
    months.add("AUGUST_2015");
    months.add("JULY_2015");
    months.add("JUNE_2015");
    months.add("MAY_2015");
    months.add("APRIL_2015");
    months.add("MARCH_2015");
    months.add("FEBRUARY_2015");
  }

  public void addNewEntry(EntityManager em) {
    for (String month : months) {
      Path base = Paths.get(START_PATH + month);
      try {
        DirectoryStream<Path> baseDir = Files.newDirectoryStream(base);
        Iterator<Path> iterator = baseDir.iterator();
        while (iterator.hasNext()) {
          Path filePath = iterator.next();
          String fileLocation = filePath.toString();
          if (Objects.nonNull(em)) {
            Long count = em.createQuery("SELECT COUNT(p) FROM ProcessFile p WHERE p.filePath = :location",
                    Long.class).setParameter("location", fileLocation).getResultList().get(0);
            if (count == 0) {
              ProcessFile processFile = new ProcessFile(fileLocation, 0, ProcessFile.Status.UNPROCESS);
              em.persist(processFile);
            }
          }
        }
      } catch (IOException ex) {
      }
    }
  }

}
