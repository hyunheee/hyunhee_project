package hyunhee_project.pattern.adapter;

/*
 *wrapper 패턴이라고도 불림 
 * 무엇인가를 포장해서 다른 용도로 사용할 수 있게 교환해 주는 패턴 
 * 
 * */

public class MainAdapter {
	public static void main(String[] args) {
		Print p = new PrintBanner("hello");
		p.printStrong();
		p.printWeak();
	}
}
