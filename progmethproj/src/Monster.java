
public abstract class Monster {
	protected double HP;
	protected int Damage;
	protected String Name;
	protected boolean isDead;
	protected double MaxHP;
	public Monster(double hp, int attack, String name) {
		this.HP=hp;
		this.Damage=attack;
		this.Name=name;
		this.isDead=false;
		this.MaxHP = hp;
	}
	public abstract void special();
	public boolean getStatus() {
		return this.isDead;
	}

	public void setStatus(boolean ddd) {
		this.isDead=ddd;
	}
	public double getHP() {
		return this.HP;
	}

	public void setHP(double hP) {
		if(hP <=0) {
			this.HP = 0;
			this.setStatus(true);
		}else this.HP=hP;
	}

	public int getDamage() {
		return this.Damage;
	}

	public void setDamage(int attack) {
		this.Damage = attack;
	}

	public String getName() {
		return Name;
	}
	public void attack(Character other) {
		other.takedDamage(this.Damage);
	}
	
	public void hit(Character o) {
		this.setHP(this.getHP()-o.getAttack());	
	}
	
}
