package hyunhee_project;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Debug {
	public static void main(String[] args) {
		Map<String, BigDecimal> map = new HashMap<>();
		BigDecimal a = new BigDecimal("1.1");
		
		map.put("cnt", a);
		
		System.out.println(map.get("cnt").intValue() == 1);
	}
}
