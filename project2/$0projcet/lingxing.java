package $0projcet;

public class lingxing {
	int size;
		  public  void dayin() {
			
		     if (size % 2 == 0) {
		         size++; // 计算菱形大小
		     }
		     for (int i = 0; i < size / 2 + 1; i++) {
		         for (int j = size / 2 + 1; j > i + 1; j--) {
		             System.out.print(" "); // 输出左上角位置的空白
		         }
		         for (int j = 0; j < 2 * i + 1; j++) {

		             System.out.print("*"); // 输出菱形上半部边缘

		         }
		         System.out.println(); // 换行
		     }
		     for (int i1 = size / 2 + 1; i1 < size; i1++) {
		         for (int j1 = 0; j1 < i1 - size / 2; j1++) {
		             System.out.print(" "); // 输出菱形左下角空白
		         }
		         for (int j1 = 0; j1< 2 * size - 1 - 2 * i1; j1++) {

		             System.out.print("*"); // 输出菱形下半部边缘

		         }
		         System.out.println(); // 换行
		     }
		}

	}

