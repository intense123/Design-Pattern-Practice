package Yo;
/*
*Implementing Single Responsibility Principle
 */
public interface LibraryItem {

    String getTitle();

    String getUniqueId();

    int calculateLateFee(int days);
    double  getValue();  //For books, this should return the value of the book. For movies
} 
