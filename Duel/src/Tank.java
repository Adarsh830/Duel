
public class Tank extends Character {
	protected int classPerk; // becomes invincible for one round

	
	public Tank (String name, int hp, int lightAtt, int heavyAtt,int classPerk) {
		super(name,hp,lightAtt,heavyAtt);
		this.classPerk = classPerk;
		super.hp=hp+classPerk;
		
	
	}

	public int getClassPerk() {
		System.out.println("HP Boost");
		return classPerk;
	}
	public void setClassPerk(int invincibilty) {
		this.classPerk = invincibilty;
	}
	
	
	
	

}
