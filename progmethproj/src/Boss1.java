
public class Boss1 extends Monster {

	public Boss1(double hp, int attack, String name) {
		super(hp, attack, name);
		// TODO Auto-generated constructor stub
	}
	//status not available at this time pls call again later
	@Override
	public void special() {
		if (this.getHP()<= this.MaxHP/2) {
			this.setDamage(this.Damage*2);
		}
	}
	
	
}
