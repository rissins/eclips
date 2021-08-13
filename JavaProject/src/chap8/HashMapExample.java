package chap8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<String, Integer>();
		
		map.put("ÀÓ¿µ¿õ", 31);
		map.put("¿µÅ¹", 38);
		map.put("ÀÌÂù¿ø", 25);
		map.put("ÀÓ¿µ¿õ", 31);
		
		System.out.println("ÃÑ Entry ¼ö : "+map.size());
		System.out.println("ÀÓ¿µ¿õ : "+map.get("ÀÓ¿µ¿õ"));
		System.out.println();
		
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator =  keySet.iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
//			Integer value = map.get(key);
			int value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		map.remove("ÀÓ¿µ¿õ");
		
		System.out.println("ÃÑ entry ¼ö: "+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t"+key+":"+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("ÃÑ entry ¼ö: "+map.size());
	}
}
