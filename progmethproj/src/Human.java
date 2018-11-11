
public class Human extends Character {
	protected double mana,max_MANA,exp;
	protected int upExpLevel=2;
	public Human(double HP,double armor,double mana,double attack,String name,String classCh,int Level) {
		super(HP,armor,attack,name,classCh,Level);
		this.mana = mana;
	}
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public double getMax_MANA() {
		return max_MANA;
	}
	public void setMax_MANA(double max_MANA) {
		this.max_MANA = max_MANA;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	
	public int getUpExpLevel() {
		return upExpLevel;
	}
	
}
