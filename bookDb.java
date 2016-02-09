import java.util.ArrayList;



/**
 * Class representing a collection of books
 * each book must have an author and a title, and a unique ID
 * The ID may never change, even if books are later removed from the 
 * collection.
 * 
 * This needs to be named BookDB.  
 * 
 */
public class BookDB {

    // Declare your instance variables here:
    public ArrayList<Integer> ID = new ArrayList();
    public ArrayList<String> Title = new ArrayList();
    public ArrayList<String> Author = new ArrayList();
    public int bookId = 0;
    public String title = " ";
    public String author = " ";
   

    // Implement each of the following public methods:
    // You must use the exact method names and arguments,
    // and you must return the correct values.
    
    /**
     * Constructor: initializes all the instance variables.
     */
    public BookDB(){
        bookId = 0;
        title = " ";
        author = " ";
        }
    
   
    /**
     * getBook: Get the book associated with an ID.
     * @param id (int)
     * @return a String representing the book.
     */
    public String getBook(int id){
        String name = "";
        String title = "";
        String author = "";
        String space = ", ";
        for(int i = 0; i < ID.size(); i++){
            if(id == ID.get(i)){
                name = Title.get(i);
                author = Author.get(i);
                title = (author+space+name);
                
                return title; 
            }
        }
        
        return title; 
    }
    
    /**
     * addBook: Add a book to our collection.
     * @param author a String with the book's author
     * @param title a String with the book's title
     * @return the ID of the added book (an int)
     */
    public int addBook(String author, String title){
        int id = 0;
        Title.add(title);
        Author.add(author);
        id = Title.indexOf(title);
        ID.add(id);
        return id;
    }

    /**
     * searchBook: Find all books containing a keyword
     * @param keyword a String with the keyword
     * @return an ArrayList of Integer values, one for each ID of a matching book
     */
    public ArrayList searchBook(String keyword){
        ArrayList<Integer> id = new ArrayList();
        int ident = 0;
        for(int i = 0; i < Title.size(); i++){
            if(Title.get(i).contains(keyword)) {
                ident = ID.get(i);
                id.add(ident);
            }
            
        }
        return id;
    }
    

    /**
     * removeBook: Remove a book with an ID from the collection
     * @param id the ID of the book to be removed (an int)
     */
    public void removeBook(int id){
        Title.remove(id);
        Author.remove(id);
        ID.remove(id);
    }
    

    /**
     * numBooks: Return a count of the books.
     * @return an int given the number of books in the collection.
     */
    public int numBooks(){
        int count = 0;
        count = Title.size();
        return count;
    }
    

}
