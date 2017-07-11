
/*
Собираем прямоугольник
*/

public class Rectangle {

	public int  top;
	public int  left;
	public int  width;
	public int  height;

	public void initialize(int top, int left, int width, int height) {
		this.top = top;
		this.left = left;
		this.width = width;
		this.height = height;
	}

	public void initialize(int top, int left, int width) {
		this.top = top;
		this.left = left;
		this.width = width;
	}

	public void initialize(int top, int left) {
		this.top = top;
		this.left = left;
	}

	public void initialize(int top) {
		this.top = top;
	}

	public static void main(String[] args) {

	}
}
