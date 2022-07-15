package day10;
/*Map계열- Hashtable, HashMap, Properties
 * - Object유형을 저장할 수 있으며
 * - key와 value를 매핑하여 저장한다.
 * - 데이터가 75% 차면 자동으로 저장 영역을 확대한다.
 * - key값의 중복을 허용하지 않는다.
 * - 무순서
 * - 데이터 저장: Object put(Object key, Object val)
 * - 데이터 추출: Object get(Object key) 
 * */
import java.util.*;
public class HashtableTest {

	public static void main(String[] args) {
		
		Hashtable<String, Integer> h1=new Hashtable<>();
		//Key:String, Value:Integer 로 지정.
		h1.put("생년", 1998);
		h1.put("월일", 3018);
		h1.put("나이", Integer.valueOf(30)); //[a]
		h1.put("연봉", 3400);
		h1.put("나이", 25);//key값은 중복되어서는 안됨. 기존꺼는 사라짐.(나중에 저장한 것으로 [a]를 덮어씀)
		
		//Map계열은 검색이 용이하다.
		Integer age=h1.get("나이");
		System.out.println("age: "+age+"세");
		System.out.println("h1.size(): "+h1.size());
		
		//Enumeration<K>	keys() : key값들만 Enumeration객체로 반환함
		//key 값들 추출해서 출력한 뒤, value도 같이 출력해보세요
		Enumeration<String> en=h1.keys();
		for(;en.hasMoreElements();) {
			String key=en.nextElement();
			System.out.println(key+">>"+h1.get(key));
		}
		
		//Set<K>	keySet() : key값들만 Set객체로 반환
		Set<String> set=h1.keySet();
		for(String ky:set) {
			System.out.println(ky);
		}
		//Collection<V>	values() : value값들만 반환
		Collection<Integer> col=h1.values();
		for(Integer val:col) {
			System.out.println(val);
		}
		
		
		
		
	}

}
