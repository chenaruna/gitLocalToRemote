public class ltr{
	private String name;
	private Int age;
	public Int getAge(){
		return age;
	}
	public static void main(String[] args){
		ltr l=new ltr();
		Int age=l.getAge();
		System.out.println("The age="+age);
		System.out.println("Message from home");
}
