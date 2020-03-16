package jp.co.internous.action;

public class Main {

	public static void main(String[]args) {
		System.out.println("Hello World");
//　sysoと入力してcontrolキーとAキーを押すと
//　System.out.println();が入力される。

//　commandキーと/キーを押すとコメントの//がでる　



/*ここから



 ここまでコメントになる
 改行していっぱい打ちたい時はこの方法*/



		String str1 ="鈴木";
				System.out.println(str1);

	    String str2 ="Tanaka";
	         System.out.println(str2);

	    String str3 ="000-000-000";
	         System.out.println(str3);
//　数字とハイフンがあるから文字列

	     String str4 ="3+3";
	         System.out.println(str4);
//	 これだと文字列として扱うから計算式がそのまま表示される

	    char char1 ='A';
	    	 System.out.println(char1);
//  文字一つは文字列では無いからchar
//	charはシングルクオーテーション

	    int num1 = 12345;
	         System.out.println(num1);
//	  数字はint

	     int num2 = 3+3;
	        System.out.println(num2);
//	計算式として代入した場合も囲まなくてOK

	     boolean boo1 =true;
	         System.out.println(boo1);
//    真偽値はboolean


	  int num3 =10;
		  if(num3<20) {
			  System.out.println("A");
		  }

		int num4 =20;
		if(num4<=30) {
			System.out.println("B");
		}

		int num5 =7;

		   if(num5>8) {
			   System.out.println("A");
		   }else if(num5<10) {
			   System.out.println("B");
		   }

		   int num6 =3;
		   if(num6>5) {
			   System.out.println("A");
		   }else {
			   System.out.println("Z");
		   }

		   int age =35;

		   if(age<20) {
			   System.out.println("未成年");
		   }else if(age>80) {
			   System.out.println("高齢者");
		   }else {
			   System.out.println("成人");
		   }

		   int num7 =10;

		   if(num7>1)
			   if(num7==2) {
				   System.out.println("A");
			   }else if(num7==3) {
				   System.out.println("B");
			   }else {
				   System.out.println("C");
			   }

		   int num8 =1;

		   switch(num8){
		   case 0:
		    System.out.println("num8は０に等しい");
		    break;


		   case 1:
		     System.out.println("num8は１に等しい");
		      break;
		   }
//	caseの最後につけるのは[;]ではなく[:]


		   int num9 =5;

		   switch(num9) {
		   case 0:
			   System.out.println("num9は０に等しい");
			   break;
		   case 1:
			   System.out.println("num9は１に等しい");
			   break;
		   default:
			   System.out.println("num9は０でも１でも無い");

		   }

//    defaultはnum9がどのcaseにも該当しない場合こうしてくださいね！
//	  って意味。最後には「:」をつける


		 String str6 = "赤";

		 switch(str6) {
		  case"赤":
			  System.out.println("紅組です");
			  break;

		  case"白":
			  System.out.println("白組です");
			  break;
		 }

		 String[] name = {"田中","木村","加藤"};
		   System.out.println(name[0]);
		   System.out.println(name[2]);

		   name[0]="池田";
		   System.out.println(name[0]);

		   String[][] country =
			   {
					   {"日本","タイ"},
					   {"アメリカ","ブラジル"},
					   {"フランス","ロシア"}
			   };
		   System.out.println(country[0][1]);

		   int[][] num10 =
			   {
					   {5,10},
					   {15,20},
					   {25,30}

			   };
		   System.out.println(num10[1][0]);
//	　intだから""とかで囲まなくてもOK

		   for(int num11=1; num11<5; num11++) {
			   System.out.println(num11);
		   }

		   for(int i=1; i<=5; i++) {
			   System.out.println("★");
		   }

		  int a=10;

		  String b=a>=5?"プラス":"マイナス";

		  System.out.println(b);

		  for(int i=0; i<=5; i++) {

			  String c= i%2==0?"☆":"★";
			  System.out.println(c);
		  }

		  int x=1;

		  while(x<=5) {
			  System.out.println("★");
			  x++;
		  }



		  String signal ="blue";

		  switch (signal) {
		  case "red":
			  System.out.println("止まれ!!!");
			  break;
//			  caseを二つ使ってどっちでも大丈夫にできる
		  case "blue":
		  case "green":
			  System.out.println("イケイケ!");
			   break;
		  case "yellow":
			  System.out.println("気をつけて");
			   break;
//			   該当しない場合は↓になる
		default:
			System.out.println("何にも当てはまらない");
			    break;

		  }

System.out.println("ここで\n改行");
//macの場合文字列の改行は「\n」でやる
//打ち方はオプションキーと￥キー

      for(int q =0; q<10; q++){
    	  if(q == 5) {
        	  break;
    	  }

          System.out.println(q);
      }
//      breakはもしこういう条件になったらループを抜けるという意味


      for(int p =0; p <10; p++) {
    	  if(p ==5) {
    		  continue;
    	  }
    	  System.out.println(p);
      }

      /*continueはここでループを抜けるという意味
       * 結果として０〜４と６〜９までが表示されて
       * 5が抜けた
       */
}
}