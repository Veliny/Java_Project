public class Archer extends Pemain{

    public Archer(int Str, int I) {
        super(Str,I);
    }
    
    public void Stat() {
        this.setHP(20 + 1.15 * this.Str);
        this.setMP(22 + 1.5 * this.Int);
        this.setAttack(1.5 * this.Str);
        this.setDefense(1 * this.Str);
        this.setEvade(10);
        this.setMagic(1 * this.Int);
        this.setMDef(1.1 * this.Str);
    }
}