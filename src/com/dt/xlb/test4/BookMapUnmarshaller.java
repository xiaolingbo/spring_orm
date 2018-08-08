package com.dt.xlb.test4;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.xml.Unmarshaller;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

public class BookMapUnmarshaller {
 
  public static void main(String[] args) {
    Mapping mapping = new Mapping();

    try {
      mapping.loadMapping(BookMapUnmarshaller.class.getResource("invt-mapping.xml"));
      FileReader reader = new FileReader(BookMapUnmarshaller.class.getResource("invt.xml").getPath());
      Unmarshaller unmarshaller = new Unmarshaller(Package.class);
      unmarshaller.setMapping(mapping);
      Package pkage = (Package)unmarshaller.unmarshal(reader);
        System.out.println("22222222222222222222");
    } catch (Exception e) {
      System.err.println(e.getMessage());
      e.printStackTrace(System.err);
    }
  }
}
