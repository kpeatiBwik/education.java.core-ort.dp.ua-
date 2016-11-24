package taskFromEugene7;

/*7. 
Класс "Прямоугольник"
Объявите класс "Прямоугольник" с полями: x1, y1, x2, y2 (координаты левого верхнего и правого нижнего углов) и методами: пересечься 
с другим прямоугольником, проверить, попадает ли точка в данный прямоугольник, масштабировать при условии неподвижности верхнего 
левого угла, передвинуть по плоскости без вращения. Выводить этот прямоугольник на консоль.﻿
*/

/**
 * Класс "Прямоугольник"
 * 
 * @author kpeatiBwik
 *
 */

public class Rectangle {

	private int x1;
	private int y1;
	private int x2;
	private int y2;

	public Rectangle() {

	}

	public Rectangle(int x1, int y1, int x2, int y2) {
		this.setX1(x1);
		this.setY1(y1);
		this.setX2(x2);
		this.setY2(y2);
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

}
