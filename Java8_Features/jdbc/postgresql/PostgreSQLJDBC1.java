package com.evergent.java8.jdbc.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;

public class PostgreSQLJDBC1 {
   public static void main(String args[]) {
      Connection c = null;
      try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/myramdb1",
            "ramkumar1","ramkumar1");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
   }
}