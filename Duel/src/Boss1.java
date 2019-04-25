public class Boss1 extends Character {
	
	private int lightAtt;  //does attack damage
	private int heavyAtt;  // does attack damage
	private String classPerk; // becomes invincible for one round
	private int ultimate;  // gains 5 more hp
	
	public Boss1 (String name, int hp, int charge, int SheildSlam, String invincibilty, int enrage ) {
		super(name,hp);
		super.setName("Boss1");
		super.setHp(hp);
		this.lightAtt = charge;
		this.heavyAtt = SheildSlam;
		this.classPerk = invincibilty;
		this.ultimate = enrage;
		
	}
	
	public int getCharge() {
		return lightAtt;
	}
	
	public void setCharge(int charge) {
		this.lightAtt = charge;
	}
	
	public int getSheildSlam() {
		return heavyAtt;
	}
	public void setSheildSlam(int SheildSlam) {
		this.heavyAtt = SheildSlam;
	}
	
	public String getInvincibilty() {
		return classPerk;
	}
	public void setInvincibilty(String invincibilty) {
		this.classPerk = invincibilty;
	}
	
	public int getEnrage() {
		return ultimate;
	}
	
	public void setEnrage(int enrage) {
		this.ultimate = enrage;
	}
	

}
