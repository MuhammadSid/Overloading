class Over{

public void sub(int num1, int num2) {
	System.out.println("num1-num2 is equal to " +(num1-num2));
}

public void sub(int num1, int num2, int num3){
	System.out.println("num1-num2-num3 is equal to " +(num1-num2-num3));
}
public void sub(int num1, int num2, int num3, int num4) {
	System.out.println("num1-num2-num3-num4 is equal to " +(num1-num2-num3-num4));
}

public void sub(int num1, int num2, int num3, int num4, int num5){
	System.out.println("num1-num2-num3-num4-num5 is equal to " +(num1-num2-num3-num4-num5));
}

public static void main(String[]args){

Over s= new Over();
s.sub(7,4,3);
}}	
