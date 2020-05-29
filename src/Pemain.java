
public abstract class Pemain implements Attack, Magic {
	private String nama;
	protected int Str;
	protected int Int;
	private double HP;
	private double MP;
	private double Attack;
	private double Defense;
	private double Magic;
	private double MDef;
	private int Evade;
	
	public int getStr() {
		return Str;
	}
	public void setStr(int str) {
		this.Str = str;
	}
	public int getInt() {
		return Int;
	}
	public void setInt(int i) {
		this.Int = i;
	}
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public double getHP() {
		return HP;
	}
	public void setHP(double d) {
		this.HP = d;
	}
	public double getMP() {
		return MP;
	}
	public void setMP(double d) {
		this.MP = d;
	}
	public double getAttack() {
		return Attack;
	}
	public void setAttack(double d) {
		this.Attack = d;
	}
	public double getDefense() {
		return Defense;
	}
	public void setDefense(double d) {
		this.Defense = d;
	}
	public double getMagic() {
		return Magic;
	}
	public void setMagic(double d) {
		this.Magic = d;
	}
	public double getMDef() {
		return MDef;
	}
	public void setMDef(double d) {
		this.MDef = d;
	}
	public int getEvade() {
		return Evade;
	}
	public void setEvade(int evade) {
		this.Evade = evade;
	}
	
	public Pemain(int Str, int i) {
		this.Str = Str;
		this.Int = i;
	}
	
	public abstract void Stat();
	public void attack() {
		System.out.print("Attack deal ");
	}
	public void magic() {
		System.out.printf("Using  deal ");
	}
}
