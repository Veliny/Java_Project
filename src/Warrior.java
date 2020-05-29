public class Warrior extends Pemain{

    public Warrior(int Str, int I) {
        super(Str,I);
    }
    
    public void Stat() {
        this.setHP(30 + 1.5 * this.Str);
        this.setMP(8 + 1.2 * this.Int);
        this.setAttack(1.75 * this.Str);
        this.setDefense(1.1 * this.Str);
        this.setEvade(0);
        this.setMagic(0.6 * this.Int);
        this.setMDef(1.25 * this.Str);
    }

	
}