
	public class Character {
		protected String name; //class name
		protected int hp; // health points
		protected int lightAtt;  //does attack damage
		protected int heavyAtt;  // does attack damage
		protected int ultimate;
	

		public Character (String name, int hp, int lightAtt, int heavyAtt) {
			this.name = name;
			this.hp=hp;
			this.lightAtt = lightAtt;
			this.heavyAtt = heavyAtt;
			this.ultimate = ultimate;
			
		}
		
		
		//getters and setters
		
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
		
		public int getHp() {
			return hp;
		}
	
		public void setHp(int hp) {
			this.hp = hp;
		}
		public int getLightAtt() {
			return lightAtt;
		}
		
		public void setLightAtt(int charge) {
			this.lightAtt = charge;
		}
		
		public int getHeavyAtt() {
			return heavyAtt;
		}
		public void setHeavyAtt(int SheildSlam) {
			this.heavyAtt = SheildSlam;
		}
		
		
		
		public int getUltimate() {
			return ultimate;
		}
		
		public void setUltimate(int enrage) {
			this.ultimate = enrage;
		}
		
		public void Att1(Character c) {
			c.setHp(c.getHp()-this.lightAtt);
		}
		public void Att2(Character c) {
			c.setHp(c.getHp()-this.heavyAtt);
		}
		
		
		
		
		
	
}
