package com.lizardtech.locale;

import java.util.*;

/**
 *
 * @author Gjergj Sheldija
 */
public class DjVuBean_en_US extends ListResourceBundle {
   {
      System.out.println("loading Strings");
   }

   public Object [][] getContents() {
      System.out.println("getting Strings");

      return contents;
   }

   static final Object[][] contents = {
      {"up", "up"},
      {"down", "down"},
      {"left", "left"},
      {"right", "right"},

      {"page up", "page up"},
      {"page down", "page down"},

      {"page width", "Page width"},
      {"fit page", "Fit page"},
      {"one to one", "One to one"},

      {"stretch", "Stretch"},
      {"zoom in", "Zoom In"},
      {"zoom out", "Zoom out"},

      {"first page", "First page"},
      {"previous page", "Previous page"},
      {"next page", "Next pagee"},
      {"last page", "Last page"},

      {"single page", "Single pagee"},
      {"book", "Book"},
      {"cover", "Cover"}
   };
}
