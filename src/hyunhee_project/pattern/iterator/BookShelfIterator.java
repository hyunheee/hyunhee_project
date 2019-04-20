package hyunhee_project.pattern.iterator;

public class BookShelfIterator implements Iterator{
	private Bookshelf bookshelf;
	private int index;
	
	public BookShelfIterator(Bookshelf bookshelf) {
		this.bookshelf = bookshelf;
		this.index = 0;
	}
	
	
	@Override
	public boolean hasnext() {
		if(index<bookshelf.getLength()) {
			return true;
		}else {
			return false;	
		}
	}

	@Override
	public Object next() {
		Book book = bookshelf.getBookAt(index);
		index++;
		return book;
	}

}
