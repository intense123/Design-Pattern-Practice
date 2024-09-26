package items;
import main.latefeecalculate;
/*
*Implementing Single Responsibility Principle
 */
public interface LibraryItem extends latefeecalculate{

    String getTitle();

    String getUniqueId();

    
    double  getValue();  //For books, this should return the value of the book. For movies
} 
