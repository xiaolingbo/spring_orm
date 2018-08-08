package com.dt.xlb.test;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.xml.Unmarshaller;

public class BookMapUnmarshaller {
 
  public static void main(String[] args) {
    Mapping mapping = new Mapping();

    try {
      mapping.loadMapping(BookMapUnmarshaller.class.getResource("book-mapping.xml"));
      FileReader reader = new FileReader(BookMapUnmarshaller.class.getResource("book.xml").getPath());
      Unmarshaller unmarshaller = new Unmarshaller(Book.class);
      unmarshaller.setMapping(mapping);
      Book book = (Book)unmarshaller.unmarshal(reader);
      System.out.println("Book ISBN: " + book.getIsbn());
      System.out.println("Book Title: " + book.getTitle());
      List authors = book.getAuthors();
      for (Iterator i = authors.iterator(); i.hasNext(); ) {
        Author author = (Author)i.next();
        System.out.println("Author: " + author.getFirstName() + " " +
                                        author.getLastName());
      }
    } catch (Exception e) {
      System.err.println(e.getMessage());
      e.printStackTrace(System.err);
    }
  }
}
