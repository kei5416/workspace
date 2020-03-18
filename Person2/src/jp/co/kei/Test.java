package jp.co.kei;

public class Test {
	
	public static void main(String[]args) {
		
		
		//コンストラクタ①
		Person taro =new Person();
		
		taro.name ="taro";
		
		taro.age =18;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		
		
		
		//コンストラクタ②
		Person jiro =new Person("jiro",20);
		
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		
		
		
		//コンストラクタ③
		Person saburo =new Person("saburo");
		
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		
		
		
		//コンストラクタ④
		Person nanasi =new Person(25);
		
		System.out.println(nanasi.name);
		System.out.println(nanasi.age);
		
		
		
		//コンストラクタ⑤
		Person hanako =new Person("hanako",17);
		
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		
	}

}
