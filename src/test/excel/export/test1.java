package test.excel.export;
import java.lang.reflect.Field;
import beo.People;
public class test1 {
	static void dataRec() {
		String[] list = { "name-1,����", "age-2,����", "address-3,��ַ", "score-4,����", "sex-5,�Ա�" };
		Field[] field = People.class.getDeclaredFields();
		int len = list.length;
		// ȡ������
		Integer[] a = new Integer[len];
		for (int k = 0; k < len; k++) {
			int j = list[k].indexOf("-");
			if (j < 0)
				break;
			a[k] = Integer.parseInt(list[k].substring(j + 1, j + 2));
			System.out.println(a[k]);
		}
		// ����ѭ��
		// ����excel
		for (int i = 0; i < field.length; i++) {
			if (list[i].contains(field[i].getName())) {
				if ("java.lang.String".equals(field[i].getType().getName())) {

				}
				if ("java.math.BigDecimal".equals(field[i].getType().getName())) {
				}
			}
		}
		for (int i = 0; i < len; i++) {
			if (list[i].contains(field[i].toString())) {
				System.out.println(list[i] + "------" + field[i]);
			}
		}
	}
	public static void main(String[] args) {
		dataRec();
	}

}
