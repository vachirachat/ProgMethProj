
public class Character {
	protected double HP,mana,armor,max_HP,max_MANA,max_ARMOR,attack;
	
	protected String name,classCh;
	protected int Level;
	protected boolean isDead;
	public Character(double HP,double mana,double armor,double attack,String name,String classCh,int Level) {
		this.HP = HP;
		this.mana = mana;
		this.armor = armor;
		this.attack = attack;
		this.name = name;
		this.classCh = classCh;
		this.Level = Level;
		this.isDead = false;
	}
	public void takedDamage(int damage) {
		if ((damage-armor)<0) return;
		HP -= (damage-armor);
	}
	public boolean isTakedDamage(int damage) {
		return HP>(damage-armor);
	}
	public double getAttack() {
		return attack;
	}
	public void setAttack(double attack) {
		this.attack = attack;
	}
	public double getHP() {
		return HP;
	}
	public void setHP(double hp) {
		HP = hp;
	}
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	public double getArmor() {
		return armor;
	}
	public void setArmor(double armor) {
		this.armor = armor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassCh() {
		return classCh;
	}
	public void setClassCh(String classCh) {
		this.classCh = classCh;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	public double getMAX_HP() {
		return max_HP;
	}
	public void setMAX_HP(double max_HP) {
		this.max_HP = max_HP;
	}
	public double getMAX_MANA() {
		return max_MANA;
	}
	public void setMAX_MANA(double max_MANA) {
		this.max_MANA = max_MANA;
	}
	public double getMAX_ARMOR() {
		return max_ARMOR;
	}
	public void setMAX_ARMOR(double max_ARMOR) {
		this.max_ARMOR = max_ARMOR;
	}
	
	
	
	
	
}
