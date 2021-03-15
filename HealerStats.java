import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.*;
public class HealerStats {
	public static void statCalculator() throws FileNotFoundException {
		Scanner in = new Scanner (System.in);
		System.out.println("What level is your healer? ");
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
			attack = (level * 1.5) + 3;
			trueAttack = (int) Math.round(attack);
			defense = (level * 2) + 4;
			trueDefense = (int) Math.round(defense);
			specialAttack = (level * 4) + 11;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (level * 4) + 5;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (level * 2.5) + 7;
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
			attack = (levelRange * 1.5) + 33;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 2) + 44;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 4.5) + 91;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 4) + 85;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 3) + 57;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 30 && level <= 45) {
			levelRange = level - 30;
			health = (levelRange * 3) + 86;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 4.5) + 109;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 2.5) + 48;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 3.5) + 64;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5) + 136;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 5) + 125;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4) + 87;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 45 && level <= 65) {
			levelRange = level - 45;
			health = (levelRange * 4) + 131;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 5.5) + 177;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 3) + 8;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4) + 117;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 6) + 211;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 5.5) + 200;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4.5) + 147;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 65 && level <= 80) {
			levelRange = level - 65;
			health = (levelRange * 4.5) + 211;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 6) + 287;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 3.5) + 68;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4.5) + 197;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 6.5) + 331;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 6.5) + 310;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 5) + 237;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 80 && level <= 100) {
			levelRange = level - 80;
			health = (levelRange * 5) + 279;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 7) + 377;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 4) + 121;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 5) + 265;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 6.5) + 429;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 6.5) + 408;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 5) + 312;
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
		String filename = characterName + "TheHealer.txt";
		PrintWriter Healer = new PrintWriter(filename);
		Healer.println(characterName + " the Healer");
		Healer.println("Level: " + n);
		Healer.println("HP: " +  a);
		Healer.println("SP: " +  b);
		Healer.println("ATK: " + c);
		Healer.println("DEF: " + d);
		Healer.println("SPA: " + e);
		Healer.println("SDF: " + f);
		Healer.println("SPD: " + g);
		Healer.println("CRT: " + h + "%");
		Healer.close();
	}
}
