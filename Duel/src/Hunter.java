
public class Hunter extends Character {
	protected int classPerk; // becomes invincible for one round

	
	public Hunter(String name, int hp, int lightAtt, int heavyAtt, int classPerk) {
		super(name,hp,lightAtt,heavyAtt);
		this.classPerk = classPerk;
		super.lightAtt = lightAtt+classPerk;	
	
	}
	
	public int getClassPerk() {
		System.out.println("Light Attack Boost");
		return classPerk;
	}
	public void setClassPerk(int invincibilty) {
		this.classPerk = invincibilty;
	}
	
	
	

}
