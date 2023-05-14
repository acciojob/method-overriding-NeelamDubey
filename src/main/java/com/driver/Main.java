package com.driver;

public class Main {
    B obj=new B();
    String x=B.meth();
  public static class A{
      public static String meth(){
          return "Invoking method from class A";
      }
  }
  public static class B extends A{
      B obj=new B();
      public static String meth(){
          return "Method is overridden in Extended class B";
      }
  }
}