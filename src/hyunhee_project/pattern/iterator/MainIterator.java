package hyunhee_project.pattern.iterator;

/*
 * 순서대로 지정하며 전체를 검색하는 처리를 위한 패턴 
 * 구현과 분리해서 하나씩 셀 수 있기 때문에 사용
 * */

public class MainIterator {
	public static void main(String[] args) {
		Bookshelf bookshelf = new Bookshelf(4);
		bookshelf.appendBook(new Book("A"));
		bookshelf.appendBook(new Book("B"));
		bookshelf.appendBook(new Book("C"));
		bookshelf.appendBook(new Book("D"));
		Iterator it = bookshelf.iterator();
		
		while(it.hasnext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
