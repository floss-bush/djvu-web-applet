package com.lizardtech.locale;

import java.util.*;

/**
 *
 * @author Gjergj Sheldija
 */
public class Toolbar_en_US extends ListResourceBundle {
   {
      System.out.println("loading Strings en_US for Toolbar");
   }

   public Object [][] getContents() {
      System.out.println("getting Strings en_US for Toolbar");

      return contents;
   }

   static final Object[][] contents = {
      {"select page", "Select page"},
      {"zoom level", "Zoom level"},

      {"first page", "First page"},
      {"last page", "Last page"},
      {"next page", "Next page"},
      {"previous page", "Previous page"},
      {"zoom in", "Zoom In"},
      {"zoom out", "Zoom Out"},

      {"search", "Search"},
      {"actual size", "Actual size"},
      {"fit page", "Fit page"},
      {"fit width", "Fit width"},
      {"pan", "Pan"},
      {"zoom mode", "Zoom mode"},
      {"text mode", "Text mode"}
   };
}
