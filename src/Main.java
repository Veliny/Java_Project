import java.util.Random;
import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	int ran(int a){
		int i = rand.nextInt(a)+1;	
		return i;
	}
	
	int strp = 1;
	int intp = 1;
	int Int = 1;
	int str = 1;
	
	void lvlup(Pemain kelas){
		if(kelas instanceof Mage) {
			strp += 1;
			intp += 4;
		}
		else if(kelas instanceof Warrior) {
			strp += 4;
			intp += 1;
		}
		else if(kelas instanceof Thief) {
			strp += 3;
			intp += 2;
		}
		else {
			strp += 3;
			intp += 2;
		}
	}
	
	void fight(Pemain kelas,int str, int  Int) {
		int i = ran(2);
		Monster mon = null;
		if(i == 1) {
		mon = new Skeleton(str, Int);
		mon.Stat();
		
		}
		else {
			mon = new Zombie(str, Int);
			mon.Stat();
		}
		kelas.Stat();
		
		double health =  mon.getHP();
		double hea = kelas.getHP();
		double MD = 0;
		double MM = 0;
		double PD = 0;
		double PM = 0;
		
		if(kelas.getAttack() > mon.getDefense()) {
			PD = kelas.getAttack() - mon.getDefense();
		}
		if(kelas.getMagic() > mon.getMDef()) {
			PM = kelas.getMagic() - mon.getMDef();
		}
		if(mon.getAttack() > kelas.getDefense()) {
			MD = mon.getAttack() - kelas.getDefense();
		}
		if(mon.getMagic() > kelas.getMDef()){
			MM = mon.getMagic() - kelas.getMDef();
		}
		
	do{
		
		System.out.printf("%.2f\n",hea);
		System.out.printf("%.2f\n",health);
		int pilih = 0;
		System.out.println("1. Attack");
		System.out.println("2. Skill");
		System.out.println("3. Items");
		System.out.println("4. Run");
		System.out.print("Choice :");
		try {
			pilih = scan.nextInt();
			scan.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		if(pilih == 1) {
			health -= PD;
		}
		else if(pilih ==2) {
			health -= PM;
		}
		else if (pilih == 4) {
			int a = ran(10);
			if(a >= 4) {
				System.out.println("kamu berhasil Kabur");
				break;
			}
		}
		int eva = ran(100);
		int j = ran(2);
		if(kelas.getEvade() < eva) {
		if(j == 1) {
			hea -= MD;
		}
		else{
			hea -= MM;
		}
		}
		else {
			System.out.println("Kamu evade");
			}
		
	}
	while(hea > 0 && health > 0);
	//lvlup(kelas);
	}
	
	public Main() {
		int pilih = 0;
		System.out.println("1. Warrior");
		System.out.println("2. Mage");
		System.out.println("3. Thief");
		System.out.println("4. Archer");
		System.out.println("Pick your class [1-4]: ");
		try {
			pilih = scan.nextInt();
			scan.nextLine();
		} catch (Exception e) {
			// TODO: handle exception
		}
		Pemain kelas = null;
		if(pilih == 1) {
			kelas = new Warrior(strp,intp);
		}
		else if(pilih == 2) {
			kelas = new Mage(strp,intp);
		}
		else if(pilih == 3) {
			kelas = new Thief(strp,intp);
		}
		else if(pilih == 4) {
			kelas = new Archer(strp,intp);
		}
		
		fight(kelas,str,Int);
	}

	public static void main(String[] args) {
		new Main();
	}

}
