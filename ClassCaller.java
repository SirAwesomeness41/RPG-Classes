import java.io.FileNotFoundException;
import java.util.Scanner;
public class ClassCaller {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner (System.in);
		System.out.println("       Protagonist: 0\nSorceror/Sorceress: 1\n           Fighter: 2\n            Healer: 3\n         Barbarian: 4\n           Warrior: 5\n         Protector: 6\n           Paladin: 7");
		System.out.print("Input number for class 0 to 7: ");
		int partyClass = in.nextInt();
		if(partyClass == 0) {
			HeroStats h = new HeroStats();
			HeroStats.statCalculator();
		}
		if(partyClass == 1) {
			SorcererAndSorceressStats s = new SorcererAndSorceressStats();
			SorcererAndSorceressStats.statCalculator();
		}
		if(partyClass == 2) {
			FighterStats f = new FighterStats();
			FighterStats.statCalculator();
		}
		if(partyClass == 3) {
			HealerStats h = new HealerStats();
			HealerStats.statCalculator();
		}
		if(partyClass == 4) {
			BarbarianStats b = new BarbarianStats();
			BarbarianStats.statCalculator();
		}
		if(partyClass == 5) {
			WarriorStats w = new WarriorStats();
			WarriorStats.statCalculator();
		}
		if(partyClass == 6) {
			ProtectorStats p = new ProtectorStats();
			ProtectorStats.statCalculator();
		}
		if(partyClass == 7) {
			PaladinStats p = new PaladinStats();
			PaladinStats.statCalculator();
		}
		if(partyClass < 0 || partyClass > 7) {
			System.out.println("error: Invalid number");
		}
	}

}
