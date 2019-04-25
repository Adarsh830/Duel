
public class Mage extends Character {
	protected int classPerk; // becomes invincible for one round

	
	public Mage(String name, int hp, int lightAtt, int heavyAtt,int classPerk) {
		super(name,hp,lightAtt,heavyAtt);
		this.classPerk = classPerk;
		super.heavyAtt = heavyAtt+classPerk;	
	
	}
	
	public int getClassPerk() {
		System.out.println("Heavy Attack Boost");
		return classPerk;
	}
	public void setClassPerk(int invincibilty) {
		this.classPerk = invincibilty;
	}
	
	
	

}
