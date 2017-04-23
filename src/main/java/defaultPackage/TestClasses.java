package defaultPackage;



public class TestClasses {
	static String str;
		public static  void main(String[] args){
			change();
			changeagain();
			System.out.println(str);
		} 
		private static void changeagain(){
			str="one";
		}
		private static void change(){
			str="two";
		}










}
