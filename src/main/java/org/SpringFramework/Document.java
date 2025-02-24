package org.SpringFramework;

public class Document {

//    private int n;
//    private int m ;
//    private int d ;
//
//    public int getN() {
//        return n;
//    }
//
//    public void setN(int n) {
//        this.n = n;
//    }
//
//    public int getM() {
//        return m;
//    }
//
//    public void setM(int m) {
//        this.m = m;
//    }
//
//    public int getD() {
//        return d;
//    }
//
//    public void setD(int d) {
//        this.d = d;
//    }
//
//    public void show(){
//        System.out.println("n = "+n);
//        System.out.println("m = "+m);
//        System.out.println("d = "+d);
//    }

    public Document() {
    System.out.println("I am document Constructor");
    }

    private Writer writer;

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public void display(){
     writer.write();

    }


}
