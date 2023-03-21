package Ch17_CollectionFramework;

public class Book {
	
	private int BookId, Prize;
	private String Name, Author;
	
	public int getBookId() {
		return BookId;
	}
	
	public void setBookId(int bookId) {
		BookId = bookId;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public String getAuthor() {
		return Author;
	}
	
	public void setAuthor(String author) {
		Author = author;
	}
	
	public int getPrize() {
		return Prize;
	}
	
	public void setPrize(int prize) {
		Prize = prize;
	}
	
	Book(int BookId,String Name, String Author, int Prize){
		this.BookId=BookId;
		this.Name=Name;
		this.Author=Author;
		this.Prize=Prize;
	}

	@Override
	public String toString() {
		return "Book [BookId=" + BookId + ", Prize=" + Prize + ", Name=" + Name + ", Author=" + Author + "]";
	}
	
	

}
