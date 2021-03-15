import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.*;
public class SorcererAndSorceressStats {
	public static void statCalculator() throws FileNotFoundException {
		Scanner in = new Scanner (System.in);
		System.out.println("What level is your sorceror or sorceress? ");
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
			health = (level * 2.5) + 18;
			trueHealth = (int) Math.round(health);
			specialPoints = (level * 3) + 12;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (level * 1.5) + 5;
			trueAttack = (int) Math.round(attack);
			defense = (level * 2) + 6;
			trueDefense = (int) Math.round(defense);
			specialAttack = (level * 4) + 8;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (level * 4) + 7;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (level * 2) + 6;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 20 && level <= 30) {
			levelRange = level - 20;
			health = (levelRange * 3) + 68;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 3.5) + 72;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 2) + 35;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 2.5) + 46;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 4.5) + 88;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 4.5) + 87;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 3) + 46;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 30 && level <= 45) {
			levelRange = level - 30;
			health = (levelRange * 4) + 98;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 4.5) + 107;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 2.5) + 55;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 3.5) + 71;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5) + 133;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 5) + 132;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4) + 76;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 45 && level <= 65) {
			levelRange = level - 45;
			health = (levelRange * 4) + 158;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 5) + 175;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 3) + 93;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4) + 124;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5.5) + 208;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 5.5) + 207;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4.5) + 136;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 65 && level <= 80) {
			levelRange = level - 65;
			health = (levelRange * 4.5) + 238;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 5.5) + 275;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 3.5) + 153;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4.5) + 204;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 6.5) + 318;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 6.5) + 317;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4.5) + 226;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 80 && level <= 100) {
			levelRange = level - 80;
			health = (levelRange * 5) + 306;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 6) + 358;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 4) + 206;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 5) + 272;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 6.5) + 416;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 6.5) + 415;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 5) + 294;
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
		String filename = characterName + "TheSorceror.txt";
		PrintWriter Sorceror = new PrintWriter(filename);
		Sorceror.println(characterName + " the Sorceror");
		Sorceror.println("Level: " + n);
		Sorceror.println("HP: " +  a);
		Sorceror.println("SP: " +  b);
		Sorceror.println("ATK: " + c);
		Sorceror.println("DEF: " + d);
		Sorceror.println("SPA: " + e);
		Sorceror.println("SDF: " + f);
		Sorceror.println("SPD: " + g);
		Sorceror.println("CRT: " + h + "%");
		Sorceror.close();
	}
}
