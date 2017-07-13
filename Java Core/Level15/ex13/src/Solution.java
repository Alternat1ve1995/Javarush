
import java.util.HashMap;
import java.util.Map;

/*
Статики-1
*/

public class Solution {
	public static Map<Double, String> labels = new HashMap<Double, String>();

	static  {
		labels.put(4.2, "42"); labels.put(42.42, "4242"); labels.put(4.42, "442"); labels.put(42.4, "42.4"); labels.put(20.0, "20");
	}

	public static void main(String[] args) {
		System.out.println(labels);
	}
}
