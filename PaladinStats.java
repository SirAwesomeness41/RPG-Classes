import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.*;
public class PaladinStats {
	public static void statCalculator() throws FileNotFoundException {
		Scanner in = new Scanner (System.in);
		System.out.println("What level is your paladin? ");
		int level = in.nextInt();
		int levelRange;
		double health;
		int trueHealth;
		double specialPoints;
		int trueSpecialPoints;
		double attack; //Attacking power
		int trueAttack;
		double defense; //Defensive power
		int trueDefense;
		double specialAttack; //Magical attacks; also impacts potency of healing spells.
		int trueSpecialAttack;
		double specialDefense; //Ability to defend from magical attacks.
		int trueSpecialDefense;
		double speed; //Determines order of action
		int trueSpeed;
		double critChance; //Chance of a critical hit.
		if(level >= 1 && level <= 20) {
			health = (level * 2) + 21;
			trueHealth = (int) Math.round(health);
			specialPoints = (level * 3) + 14;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (level * 4) + 11;
			trueAttack = (int) Math.round(attack);
			defense = (level * 2) + 6;
			trueDefense = (int) Math.round(defense);
			specialAttack = (level * 4) + 11;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (level * 2) + 5;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (level * 3.5) + 11;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 20 && level <= 30) {
			levelRange = level - 20;
			health = (levelRange * 2.5) + 61;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 3.5) + 74;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 4.5) + 91;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 2) + 46;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5) + 91;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 2.5) + 45;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4) + 81;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 30 && level <= 45) {
			levelRange = level - 30;
			health = (levelRange * 3.5) + 86;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 5) + 109;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5) + 136;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 2.5) + 66;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5.5) + 141;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 3) + 70;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4.5) + 121;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 45 && level <= 65) {
			levelRange = level - 45;
			health = (levelRange * 4.5) + 139;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 5.5) + 184;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5.5) + 211;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 3) + 104;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 6) + 224;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 3.5) + 115;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4.5) + 189;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 65 && level <= 80) {
			levelRange = level - 65;
			health = (levelRange * 5.5) + 229;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 6) + 294;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5.5) + 321;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 3.5) + 164;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 6.5) + 344;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 3.5) + 185;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 5) + 279;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 80 && level <= 100) {
			levelRange = level - 80;
			health = (levelRange * 6) + 312;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 6.5) + 384;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 6) + 404;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4) + 217;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 7) + 442;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 4) + 238;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 5) + 354;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else {
			System.out.println("Minimum value: 1. Maximum value: 100.");
		}
	}
	public static void statList (int n, int a, int b, int c, int d, int e, int f, int g, double h) throws FileNotFoundException {
		Scanner in = new Scanner (System.in);
		System.out.println("Level: " + n + "\nHP: " + a + "\nSP: " + b + "\nATK: " + c + "\nDEF: " + d + "\nSPA: " + e + "\nSDF: " + f + "\nSPD: " + g + "\nCRT: " + h + "%");
		System.out.println("Give the character a name: ");
		String characterName = in.nextLine();
		String filename = characterName + "ThePaladin.txt";
		PrintWriter p = new PrintWriter(filename);
		p.println(characterName + " the Paladin");
		p.println("Level: " + n);
		p.println("HP: " +  a);
		p.println("SP: " +  b);
		p.println("ATK: " + c);
		p.println("DEF: " + d);
		p.println("SPA: " + e);
		p.println("SDF: " + f);
		p.println("SPD: " + g);
		p.println("CRT: " + h + "%");
		p.close();
	}
}
