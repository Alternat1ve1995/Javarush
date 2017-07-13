
/*
Мосты
*/

public class Solution {
	public static void main(String[] args) {
		Solution.println(new WaterBridge());
		Solution.println(new SuspensionBridge());
	}

	public static void println(Bridge bridge) {

		System.out.println(bridge.getCarsCount());
	}
}

