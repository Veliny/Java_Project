public class Mage extends Pemain{

    public Mage(int Str, int I) {
        super(Str,I);
    }
    
    public void Stat() {
        this.setHP(20 + 1.1 * this.Str);
        this.setMP(8 + 1.5 * this.Int);
        this.setAttack(0.75 * this.Str);
        this.setDefense(1.1 * this.Str);
        this.setEvade(0);
        this.setMagic(1.5 * this.Int);
        this.setMDef(1.3 * this.Str);
    }
}