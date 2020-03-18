package jp.co.kei;

public class Test {

	public static void main(String[] args) {

		Person taro =new Person();

		taro.name="山田太郎";

		taro.age=20;

		taro.address="aaaaa@gmail.com";

		taro.phoneNumber="000-000-000";




		Person jiro =new Person();

		jiro.name="木村次郎";

		jiro.age=18;

		jiro.address="bbbbb@gmail.com";

		jiro.phoneNumber="111-111-111";


		Person hanako =new Person();

		hanako.name="鈴木花子";

		hanako.age=16;

		hanako.address="ccccc@gmail.com";

		hanako.phoneNumber="222-222-222";


		Person kei =new Person();

		kei.name="池田圭";

		kei.age=24;

		kei.address="ddddd@gmail.com";

		kei.phoneNumber="333-333-333";



		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.address);
		System.out.println(taro.phoneNumber);
		taro.talk();
		taro.walk();
		taro.run();

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.address);
		System.out.println(jiro.phoneNumber);

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.address);
		System.out.println(hanako.phoneNumber);

		System.out.println(kei.name);
		System.out.println(kei.age);
		System.out.println(kei.address);
		System.out.println(kei.phoneNumber);



		Robot aibo =new Robot();

		aibo.name="aibo";

		aibo.talk();
		aibo.walk();
		aibo.run();


		Robot asimo =new Robot();

		asimo.name="asimo";

		asimo.talk();
		asimo.walk();
		asimo.run();


		Robot pepper =new Robot();

		pepper.name="pepper";

		pepper.talk();
		pepper.walk();
		pepper.run();




	}
}
