package com.outros.exercicios;

public class OfVal {
	 public static void main(String[] args) {
	    //String --> OBJETOS
	    Float f = Float.valueOf("10");
	    System.out.println(f);
	    Integer i = new Integer(10);
	    //Objeto --> Primitivo
	    int g = i.intValue();
	    System.out.println(g);
	 }
}
