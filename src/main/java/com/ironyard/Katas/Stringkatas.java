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
        Endup("hi");


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




