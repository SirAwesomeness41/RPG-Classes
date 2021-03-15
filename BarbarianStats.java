import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.*;
import java.text.DecimalFormat;

public class BarbarianStats {
	public static void statCalculator() throws FileNotFoundException {
		Scanner in = new Scanner (System.in);
		System.out.println("What level is your barbarian? ");
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
		double critChance; //Chance of a critical hit.
		if(level >= 1 && level <= 20) {
			health = (level * 3) + 20;
			specialPoints = (level * 1) + 6;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (level * 5) + 12;
			trueAttack = (int) Math.round(attack);
			defense = (level * 4.5) + 9;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (level * 1) + 3;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (level * 2) + 6;
			trueSpeed = (int) Math.round(speed);
			critChance = (level * 2) / 5;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 20 && level <= 30) {
			levelRange = level - 20;
			health = (levelRange * 4) + 80;
			specialPoints = (levelRange * 1.5) + 26;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5.5) + 112;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 5) + 99;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 2) + 23;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 2.5) + 46;
			trueSpeed = (int) Math.round(speed);
			critChance = (level * 2) / 5;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 30 && level <= 45) {
			levelRange = level - 30;
			health = (levelRange * 5) + 120;
			specialPoints = (levelRange * 2.5) + 41;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 6) + 167;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 5) + 149;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 3) + 43;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 2.5) + 71;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 2.5;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 45 && level <= 65) {
			levelRange = level - 45;
			health = (levelRange * 6) + 195;
			specialPoints = (levelRange * 3) + 79;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 6.5) + 257;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 5.5) + 224;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 3) + 88;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 2.5) + 109;
			trueSpeed = (int) Math.round(speed);
			critChance = (level * 2) / 5;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 65 && level <= 80) {
			levelRange = level - 65;
			health = (levelRange * 7) + 315;
			specialPoints = (levelRange * 3.5) + 139;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 7.5) + 387;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 6.5) + 334;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 3) + 148;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 2.5) + 159;
			trueSpeed = (int) Math.round(speed);
			critChance = (level * 2) / 5;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 80 && level <= 100) {
			levelRange = level - 80;
			health = (levelRange * 8) + 420;
			specialPoints = (levelRange * 4) + 192;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 8) + 500;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 7) + 432;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 4) + 193;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 3) + 197;
			trueSpeed = (int) Math.round(speed);
			critChance = (level * 2) / 5;
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
		String filename = characterName + "TheBarbarian.txt";
		PrintWriter Barbarian = new PrintWriter(filename);
		Barbarian.println(characterName + " the Barbarian");
		Barbarian.println("Level: " + n);
		Barbarian.println("HP: " +  a);
		Barbarian.println("SP: " +  b);
		Barbarian.println("ATK: " + c);
		Barbarian.println("DEF: " + d);
		Barbarian.println("SPA: " + e);
		Barbarian.println("SDF: " + f);
		Barbarian.println("SPD: " + g);
		Barbarian.println("CRT: " + h + "%");
		Barbarian.close();
	}
}
