package $0projcet;

public class lingxing {
	int size;
		  public  void dayin() {
			
		     if (size % 2 == 0) {
		         size++; // �������δ�С
		     }
		     for (int i = 0; i < size / 2 + 1; i++) {
		         for (int j = size / 2 + 1; j > i + 1; j--) {
		             System.out.print(" "); // ������Ͻ�λ�õĿհ�
		         }
		         for (int j = 0; j < 2 * i + 1; j++) {

		             System.out.print("*"); // ��������ϰ벿��Ե

		         }
		         System.out.println(); // ����
		     }
		     for (int i1 = size / 2 + 1; i1 < size; i1++) {
		         for (int j1 = 0; j1 < i1 - size / 2; j1++) {
		             System.out.print(" "); // ����������½ǿհ�
		         }
		         for (int j1 = 0; j1< 2 * size - 1 - 2 * i1; j1++) {

		             System.out.print("*"); // ��������°벿��Ե

		         }
		         System.out.println(); // ����
		     }
		}

	}

