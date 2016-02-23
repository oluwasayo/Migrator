/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.utils;

import com.prodigy4440.entities.BusinessDistrict;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author prodigy4440
 */
public class GeneralUtil {

  public static Date parseDate(String sDate) {
    if (sDate.equalsIgnoreCase("-1.0")) {
      return null;
    }
    String[] split = sDate.trim().split(" ");
    if (split.length != 2) {
      return null;
    }

    try {

      String[] split1 = split[0].split("/");
      int month = Integer.parseInt(split1[0]);
      int day = Integer.parseInt(split1[1]);
      int year = Integer.parseInt(split1[2]);

      String[] split2 = split[1].split(":");
      int hour = Integer.parseInt(split2[0]);
      int minute = Integer.parseInt(split2[1]);
      int second = Integer.parseInt(split2[2]);

      LocalDateTime localDateTime = LocalDateTime.of(year, month, day, hour, minute, second);
      return asDate(localDateTime);

    } catch (ArrayIndexOutOfBoundsException aioobe) {
      return null;
    } catch (NumberFormatException mException) {
      return null;
    }
  }

  public static Date asDate(LocalDate localDate) {
    return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
  }

  public static Date asDate(LocalDateTime localDateTime) {
    return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
  }

  public static LocalDate asLocalDate(Date date) {
    return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
  }

  public static LocalDateTime asLocalDateTime(Date date) {
    return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
  }

  public static BusinessDistrict computeDistrict(String district) {
    if (district.equalsIgnoreCase("AGBARA")) {
      return BusinessDistrict.AGBARA;
    } else if (district.equalsIgnoreCase("AJELE")) {
      return BusinessDistrict.ISLAND;
    } else if (district.equalsIgnoreCase("IBEJU")) {
      return BusinessDistrict.LEKKI;
    } else if (district.equalsIgnoreCase("LEKKI")) {
      return BusinessDistrict.LEKKI;
    } else if (district.equalsIgnoreCase("ISLAND")) {
      return BusinessDistrict.ISLAND;
    } else if (district.equalsIgnoreCase("APAPA")) {
      return BusinessDistrict.APAPA;
    } else if (district.equalsIgnoreCase("FESTAC")) {
      return BusinessDistrict.FESTAC;
    } else if (district.equalsIgnoreCase("IJORA")) {
      return BusinessDistrict.IJORA;
    } else if (district.equalsIgnoreCase("MUSHIN")) {
      return BusinessDistrict.MUSHIN;
    } else if (district.equalsIgnoreCase("OJO")) {
      return BusinessDistrict.OJO;
    } else if (district.equalsIgnoreCase("ORILE")) {
      return BusinessDistrict.ORILE;
    } else {
      return null;
    }
  }

}
