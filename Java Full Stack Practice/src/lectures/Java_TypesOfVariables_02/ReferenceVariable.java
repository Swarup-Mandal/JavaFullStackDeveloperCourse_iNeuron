package lectures.Java_TypesOfVariables_02;

class Testt{
	private int eid;
	private int eScore;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int geteScore() {
		return eScore;
	}
	public void seteScore(int eScore) {
		this.eScore = eScore;
	}
	
//	public Testt(int eid , int eScore){
//		this.eid=eid;
//		this.eScore=eScore;
//	}
	
}
public class ReferenceVariable {

	public static void main(String[] args) {
		//reference variable stores only object(hashcode of the object)
		
		//creating Object 
		Testt t1 = new Testt();   //here t1 and t2 is reference variable those are holding object
		//Testt t2 = new Testt();
		t1.setEid(112);
		t1.seteScore(85);
		System.out.println(t1.getEid());
		System.out.println(t1.geteScore());
		System.out.println("End");

	}

}
