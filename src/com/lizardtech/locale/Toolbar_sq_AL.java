package com.lizardtech.locale;

import java.util.*;

/**
 *
 * @author Gjergj Sheldija
 */
public class Toolbar_sq_AL extends ListResourceBundle {
   {
      System.out.println("loading Strings sq_AL for Toolbar");
   }

   public Object [][] getContents() {
      System.out.println("getting Strings sq_AL for Toolbar");

      return contents;
   }

   static final Object[][] contents = {
      {"select page", "Zgjidh Faqen"},
      {"zoom level", "Zgjidh Zoom"},

      {"first page", "Faqja e pare"},
      {"last page", "Faqja e fundit"},
      {"next page", "Faqja pasardhese"},
      {"previous page", "Faqja paraardhese"},
      {"zoom in", "Zoom In"},
      {"zoom out", "Zoom Out"},

      {"search", "Kerko"},
      {"actual size", "Madhesi reale"},
      {"fit page", "Madhesi e faqes"},
      {"fit width", "Gjeresi e faqes"},
      {"pan", "Panoramike"},
      {"zoom mode", "Opsioni Zoom"},
      {"text mode", "Opsioni tekst"}
   };
}
