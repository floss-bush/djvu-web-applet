package com.lizardtech.locale;

import java.util.*;

/**
 *
 * @author Gjergj Sheldija
 */
public class DjVuBean_sq_AL extends ListResourceBundle {
   {
      System.out.println("loading Strings sq_AL for DjVuBean");
   }

   public Object [][] getContents() {
      System.out.println("getting Strings sq_AL for DjVuBean");

      return contents;
   }

   static final Object[][] contents =  {
      {"up", "lart"},
      {"down", "poshte"},
      {"left", "majtas"},
      {"right", "djathtas"},

      {"page up", "faqe lart"},
      {"page down", "faqe poshte"},

      {"page width", "Gjeresi e faqes"},
      {"fit page", "Gjithe faqja"},
      {"one to one", "Nje nga nje"},

      {"stretch", "Zgjero"},
      {"zoom in", "Zmadho"},
      {"zoom out", "Zvogelo"},

      {"first page", "Faqja e pare"},
      {"previous page", "Faqja paraardhese"},
      {"next page", "Faqja pasardhese"},
      {"last page", "Faqja e fundit"},

      {"single page", "nje faqe"},
      {"book", "liber"},
      {"cover", "kopertina"}
   };
}
