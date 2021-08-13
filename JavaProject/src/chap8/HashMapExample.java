package chap8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map =new HashMap<String, Integer>();
		
		map.put("�ӿ���", 31);
		map.put("��Ź", 38);
		map.put("������", 25);
		map.put("�ӿ���", 31);
		
		System.out.println("�� Entry �� : "+map.size());
		System.out.println("�ӿ��� : "+map.get("�ӿ���"));
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
		
		map.remove("�ӿ���");
		
		System.out.println("�� entry ��: "+map.size());
		
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
		System.out.println("�� entry ��: "+map.size());
	}
}
