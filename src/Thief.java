public class Thief extends Pemain{

    public Thief(int Str, int I) {
        super(Str,I);
    }
    
    public void Stat() {
        this.setHP(23 + 1.25 * this.Str);
        this.setMP(18 + 1.25 * this.Int);
        this.setAttack(1.25 * this.Str);
        this.setDefense(0.8 * this.Str);
        this.setEvade(25);
        this.setMagic(1.25 * this.Int);
        this.setMDef(1.1* this.Str);
    }
}