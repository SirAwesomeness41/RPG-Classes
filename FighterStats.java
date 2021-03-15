import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.*;
public class FighterStats {
	public static void statCalculator() throws FileNotFoundException {
		Scanner in = new Scanner (System.in);
		System.out.println("What level is your fighter? ");
		int level = in.nextInt();
		int levelRange = 1;
		int health;
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
		int critChance; //Chance of a critical hit.
		if(level >= 1 && level <= 20) {
			health = (level * 3) + 23;
			specialPoints = (level * 1) + 4;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (level * 4) + 10;
			trueAttack = (int) Math.round(attack);
			defense = (level * 2.5) + 6;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (level * 1.5) + 3;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (level * 3) + 9;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 3;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 20 && level <= 30) {
			levelRange = level - 20;
			health = (levelRange * 3) + 83;
			specialPoints = (levelRange * 1) + 24;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5) + 90;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 3) + 56;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 1.5) + 33;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 3.5) + 69;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 3;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 30 && level <= 45) {
			levelRange = level - 30;
			health = (levelRange * 4) + 113;
			specialPoints = (levelRange * 2) + 34;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5.5) + 140;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 3.5) + 86;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 2) + 48;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4) + 104;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 3;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 45 && level <= 65) {
			levelRange = level - 45;
			health = (levelRange * 4) + 173;
			specialPoints = (levelRange * 2.5) + 64;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 6.5) + 223;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 3.5) + 139;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 2.5) + 78;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 5) + 164;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 3;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 65 && level <= 80) {
			levelRange = level - 65;
			health = (levelRange * 5) + 253;
			specialPoints = (levelRange * 3) + 114;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 7) + 353;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4) + 209;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 3) + 128;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 5.5) + 264;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 3;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 80 && level <= 100) {
			levelRange = level - 80;
			health = (levelRange * 6) + 328;
			specialPoints = (levelRange * 3) + 159;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 8) + 458;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 5) + 269;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 4) + 173;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 6) + 347;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 3;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
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
		String filename = characterName + "TheFighter.txt";
		PrintWriter Fighter = new PrintWriter(filename);
		Fighter.println(characterName + " the Fighter");
		Fighter.println("Level: " + n);
		Fighter.println("HP: " +  a);
		Fighter.println("SP: " +  b);
		Fighter.println("ATK: " + c);
		Fighter.println("DEF: " + d);
		Fighter.println("SPA: " + e);
		Fighter.println("SDF: " + f);
		Fighter.println("SPD: " + g);
		Fighter.println("CRT: " + h + "%");
		Fighter.close();
	}
}
