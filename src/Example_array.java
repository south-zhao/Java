import java.util.Arrays;

public class Example_array {
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		int[] b = {100, 200, 300};
		System.out.println("数组a的元素个数：" + a.length);
		System.out.println("数组b的元素个数：" + b.length);
		System.out.println("数组a的引用:" + Arrays.toString(a));
		System.out.println("数组b的引用:" + Arrays.toString(b));
	}
}
