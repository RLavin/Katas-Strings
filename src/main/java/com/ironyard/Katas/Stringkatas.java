package com.ironyard.Katas;

/**
 * Created by Raul on 10/17/16.
 */
public class Stringkatas {

    public static void main(String[] args){
        explode("startup");
        System.out.println("");
        startsWithNot("raul");
        System.out.println("");
        missingchar("amazon", 2);
        System.out.println("");
        frontBack("IronYard");
        System.out.println("");
        frontThree("Back");
        System.out.println("");
        backAround("hope");
        System.out.println("");
        Front22("abc");
        System.out.println("");
        deleteDel("adevc") ;
        System.out.println("");
        startOz("bzoo");
        System.out.println("");
        Endup("hits");



        }

        public static void explode(String e){

            System.out.print("explode(\"" +e+ "\")-->");
            System.out.print("\"");
            System.out.print(e.replace("", " ").trim());
            System.out.print("\"");


        }

    public static void startsWithNot(String nt){

        System.out.print("notString(\"" +nt+ "\")-->");
        System.out.print("\"");

        if ( nt.startsWith("not")) {

            System.out.print(nt);
        }

        else {
            System.out.print("not" + nt);
        }

        System.out.print("\"");



        }


        public static void missingchar(String m, int x){

            System.out.print("missingChar(\"" +m+ "\")-->");
            System.out.print("\"");
            String test = m.substring(0, x) + m.substring(x+1);
            System.out.print(test);
            System.out.print("\"");



        }

      public static void frontBack(String s) {

          System.out.print("frontBack(\"" + s + "\")-->");
          System.out.print("\"");


          int length = s.length();
          String z = s.charAt(length - 1) + s.substring(1, length - 1) + s.charAt(0);

          if (length <= 1) {
              System.out.print(s);
          } else {
              System.out.print(z);


          }

          System.out.print("\"");
      }

      public static void frontThree(String a){


          System.out.print("front3(\"" + a + "\")-->");
          System.out.print("\"");

          char[] chars = a.toCharArray();
           for(int i =0; i < 3; i++){

              for(int d = 0; d < 3; d++){


                  System.out.print(chars[d]);
              }

          }

          System.out.print("\"");


      }


      public static void backAround(String r){

          System.out.print("backAround(\"" + r + "\")-->");
          System.out.print("\"");
          String x = r.substring(r.length()-1);
          System.out.print( x + r + x );
          System.out.print("\"");




      }

      public static void Front22(String y){

          System.out.print("front22(\"" + y + "\")-->");
          System.out.print("\"");

          if (y.length() < 2) {
              System.out.print(y+y+y) ;
          }

          else {
              String x = y.substring(0,2);
              System.out.print(x+y+x);
          }


          System.out.print("\"");


      }

      public static void deleteDel(String x){

          System.out.print("delDel(\"" + x + "\")-->");
          System.out.print("\"");

          if (x.length() <= 3){
              System.out.print(x);
          }

         else if(x.substring(1,4).equals("del")) {
              StringBuilder sb = new StringBuilder(x);
              sb.replace(1,4,"");
              System.out.print(sb);

          }
          else {
             System.out.print(x);
          }
          System.out.print("\"");

      }

      public static void startOz(String y){

          System.out.print("startOz(\"" + y + "\")-->");
          System.out.print("\"");

          String x = "";
          if (y.length() >= 1 && y.charAt(0)=='o') {
              x = x + y.charAt(0);
          }

          if (y.length() >= 2 && y.charAt(1)=='z') {
              x = x + y.charAt(1);
          }

          else {
              String a = y.substring(0,2);
              System.out.print(a);
          }

          System.out.print(x);
          System.out.print("\"");




      }


      public static void Endup(String x){

          System.out.print("endUp(\"" + x + "\")-->");
          System.out.print("\"");

          int firstuppper = x.length()-3;
          int length = x.length();

          if (x.length() < 3) {
             System.out.print(x.toUpperCase());
          }
          else {
              String upper = x.substring(firstuppper, length).toUpperCase();
              System.out.print(x.substring(0, firstuppper) + upper);
          }
          System.out.print("\"");


      }

      }




