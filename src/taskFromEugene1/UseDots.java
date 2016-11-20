package taskFromEugene1;

/*1.
Дан массив точек. Каждая точка характеризуется координатами х, у и названием точки. 
Сортировать точки в массиве по возрастанию удаления расстояния точки от начала координат и вывести их на экран
*/


public class UseDots {

	public static void main(String[] args) {

		final int dotsCount = 5;
		Dots[] dots = new Dots[dotsCount];
		dots[0] = new Dots("dot1", 5, 10);
		dots[1] = new Dots("dot2", 2, 14);
		dots[2] = new Dots("dot3", 3, 5);
		dots[3] = new Dots("dot4", 1, 2);
		dots[4] = new Dots("dot5", 7, 7);

		double[] dotsDistance = new double[dotsCount];

		for (int i = 0; i < dots.length; i++) {
			dotsDistance[i] = (int) Math.sqrt(dots[i].getX() * dots[i].getX() + dots[i].getY() * dots[i].getY());
		}
		bubbleSortForDots(dotsDistance, dots);
		printDots(dots);
	}

	private static void bubbleSortForDots(double[] dotsDistance, Dots dots[]) {
		for (int i = dotsDistance.length - 1; i > 0; --i) {
			for (int j = 0; j < i; ++j) {
				if (dotsDistance[j] > dotsDistance[j + 1]) {
					double temp = dotsDistance[j];
					dotsDistance[j] = dotsDistance[j + 1];
					dotsDistance[j + 1] = temp;

					Dots temp1 = dots[j];
					dots[j] = dots[j + 1];
					dots[j + 1] = temp1;

				}
			}
		}
	}

	private static String dotsToString(Dots dots) {
		StringBuilder sb = new StringBuilder();
		sb.append(dots.getDotName()).append(" - ").append(dots.getX()).append(',').append(dots.getY());
		return sb.toString();
	}
	
	private static void printDots(Dots[] dots) {
		for(int i = 0; i < dots.length; ++i) {
			Dots dotsResult = dots[i];
			String dotsInString = dotsToString(dotsResult);
			System.out.printf("%d. %s%n", i + 1,
					dotsInString);
		}

	}
}
