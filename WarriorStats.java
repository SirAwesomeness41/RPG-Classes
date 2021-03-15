import java.util.Scanner;
import java.math.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class WarriorStats {
	public static void statCalculator() throws FileNotFoundException {
		Scanner in = new Scanner (System.in);
		System.out.println("What level is your warrior? ");
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
			health = (level * 3) + 20;
			specialPoints = (level * 1) + 6;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (level * 4) + 8;
			trueAttack = (int) Math.round(attack);
			defense = (level * 3.5) + 7;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (level * 1.5) + 4;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (level * 2.5) + 7;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 5;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 20 && level <= 30) {
			levelRange = level - 20;
			health = (levelRange * 4) + 80;
			specialPoints = (levelRange * 1.5) + 26;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 4.5) + 88;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4) + 77;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 2) + 34;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 3) + 57;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 5;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 30 && level <= 45) {
			levelRange = level - 30;
			health = (levelRange * 5) + 120;
			specialPoints = (levelRange * 2.5) + 41;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5) + 133;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4.5) + 117;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 3) + 54;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 3) + 87;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 5;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 45 && level <= 65) {
			levelRange = level - 45;
			health = (levelRange * 6) + 195;
			specialPoints = (levelRange * 3) + 79;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5.5) + 208;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 5) + 185;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 3.5) + 99;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 3.5) + 132;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 5;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 65 && level <= 80) {
			levelRange = level - 65;
			health = (levelRange * 7) + 315;
			specialPoints = (levelRange * 3.5) + 139;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5.5) + 318;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 5.5) + 285;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 4) + 169;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 3.5) + 202;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 5;
			statList(level, health, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 80 && level <= 100) {
			levelRange = level - 80;
			health = (levelRange * 8) + 420;
			specialPoints = (levelRange * 4) + 192;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 6) + 401;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 6) + 368;
			trueDefense = (int) Math.round(defense);
			specialAttack = 0;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 4) + 229;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4) + 255;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 5;
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
		String filename = characterName + "TheWarrior.txt";
		PrintWriter w = new PrintWriter(filename);
		w.println(characterName + " the Warrior");
		w.println("Level: " + n);
		w.println("HP: " +  a);
		w.println("SP: " +  b);
		w.println("ATK: " + c);
		w.println("DEF: " + d);
		w.println("SPA: " + e);
		w.println("SDF: " + f);
		w.println("SPD: " + g);
		w.println("CRT: " + h + "%");
		w.close();
	}
}
