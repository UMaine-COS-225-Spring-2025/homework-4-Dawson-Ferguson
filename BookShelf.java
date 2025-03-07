import java.util.ArrayList;

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> books;

    public BookShelf(char firstLetter){
        this.firstLetter = firstLetter;
        books = new ArrayList<>(8);
        for(int i = 0; i < 8; i++){
            books.add(null);
        }
    }

    public void addBook(Book book){
        for(int i = 0; i < books.size();i++ ){
            Book index = books.get(i);
            if(index==null){
                if(firstLetter==book.title.charAt(0)){
                    books.set(i,book);
                    return;
                }
            }
        }
        
    }

    public void removeBook(int index){
        if(index < books.size()){
            books.set(index,null);
            return;
        }
        else{
            return;
        }
    }

    public String toString(){
        int count = 0;
        String bookList = "";
        for(int i = 0; i < books.size(); i++){
            Book book = books.get(i);
            if(book != null){
                bookList += (book.title + "   ");              
            }
            else{
                count++;
            }
            if(count == books.size()){
                bookList = "Empty";
            }
        }
        return bookList;
    }
}
