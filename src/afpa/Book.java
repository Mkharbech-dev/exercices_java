package afpa;

public class Book {
		//Déclatarion des Variables
		private String title;
		private String autor;
		private int price;
		
		// Creation de Constructeur:
		public Book(String title, String autor, int price) {
			super();
			this.title = title;
			this.autor = autor;
			this.price = price;
		}
		// creation de fonction to String()
		@Override
		public String toString() {
			return "Book [title=" + title + ", autor=" + autor + ", price=" + price + "]";
		}
		
		// Getter et Setter
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
}
