
package reverse;

import java.util.Arrays;
import java.util.Collections;

public class Test {
	public static String sortString(String str){
		char[] c=str.toCharArray();
		Arrays.sort(c);
		return String.valueOf(c);

		}
	public static void main(String[] args)
	{
		String s="Computer";
		String resu=sortString(s);
		System.out.println(resu);
	}
}
