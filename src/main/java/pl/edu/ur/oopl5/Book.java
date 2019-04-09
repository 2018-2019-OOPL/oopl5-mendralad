/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author student
 */
public class Book {
    private String title;
    private String author;
    private int pages;
    private int year;
    public int price;

    public Book(String title, String author, int pages, int year, int price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.price = price;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public void setTitle(String title) {
        this.title=title;
    }
    
    public void setAuthor(String author) {
        this.author=author;
    }
    
    public void setPages(int pages) {
        this.pages=pages;
    }
    
    public void setYear(int year) {
        this.year=year;
    }
    
    public void setPrice(int price) {
        this.price=price;
    }
    
    public void showData(){
        System.out.println("Ksi¹¿ka:");
        System.out.println("Tytu³: "+ title);
        System.out.println("Autor: "+author);
        System.out.println("Liczba stron: "+pages);
        System.out.println("Rok: "+year);
        System.out.println("Cena: "+price);
    }
}
