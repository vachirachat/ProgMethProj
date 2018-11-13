
public class Class1 extends Character implements Humen{

	public Class1(){
	super(100,100,100,20,"nameChar","nameClass",1);
	}
	public Class1(double HP,double mana,double armor,double attack,String name,String classCh,int Level) {
		super(HP,mana,armor,attack,name,classCh,Level);
	}
	
	public boolean isCanAttack() {
		return true;
	}
	
	public boolean LevelUp() {
		return true;
	}
	
	
}
