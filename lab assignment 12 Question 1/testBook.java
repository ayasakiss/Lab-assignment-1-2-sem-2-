package labAss12_Q1;

public class testBook {
	public static void main(String[] args) {
		
		//author
		Identification author1 = new Identification("maya", "maya@gmail.com", 'F');
		Identification author2 = new Identification("ali", "ali@gmail.com", 'M');
		
		//book
		Book book1 = new Book("snow white", author1, 50.0, 2);
		Book book2 = new Book("algebraic expressions", author2, 75.0, 2);
		
		
		//details
		System.out.println("----book log----");
		System.out.println("Book 1: " + book1);
		System.out.println("Book 2: " + book2);
		
	}
}
