import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.*;
public class ProtectorStats {
	public static void statCalculator() throws FileNotFoundException {
		Scanner in = new Scanner (System.in);
		System.out.println("What level is the human shield? ");
		int level = in.nextInt();
		int levelRange = 1;
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
		int critChance; //Chance of a critical hit.
		if(level >= 1 && level <= 20) {
			health = (level * 4) + 26;
			trueHealth = (int) Math.round(health);
			specialPoints = (level * 2) + 10;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (level * 2.5) + 6;
			trueAttack = (int) Math.round(attack);
			defense = (level * 4) + 10;
			trueDefense = (int) Math.round(defense);
			specialAttack = (level * 4) + 8;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (level * 4) + 10;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (level * 3) + 9;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 20 && level <= 30) {
			levelRange = level - 20;
			health = (levelRange * 4.5) + 106;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 2.5) + 50;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 2.5) + 56;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4.5) + 90;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 4.5) + 88;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 4.5) + 90;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 3.5) + 69;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 30 && level <= 45) {
			levelRange = level - 30;
			health = (levelRange * 6.5) + 151;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 4) + 75;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 3) + 81;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 6) + 135;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5) + 133;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 5.5) + 135;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4.5) + 104;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 45 && level <= 65) {
			levelRange = level - 45;
			health = (levelRange * 8) + 249;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 5) + 135;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 3.5) + 126;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 7) + 225;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5.5) + 208;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 6) + 218;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 5) + 172;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 65 && level <= 80) {
			levelRange = level - 65;
			health = (levelRange * 9) + 409;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 5.5) + 235;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 3.5) + 196;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 7.5) + 365;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5.5) + 318;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 6.5) + 338;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 5.5) + 272;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 80 && level <= 100) {
			levelRange = level - 80;
			health = (levelRange * 9.5) + 544;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 6) + 318;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 4) + 249;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 8) + 478;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 6) + 401;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 7) + 436;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 6) + 355;
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
		String filename = characterName + "TheProtector.txt";
		PrintWriter Protector = new PrintWriter(filename);
		Protector.println(characterName + " the Protector");
		Protector.println("Level: " + n);
		Protector.println("HP: " +  a);
		Protector.println("SP: " +  b);
		Protector.println("ATK: " + c);
		Protector.println("DEF: " + d);
		Protector.println("SPA: " + e);
		Protector.println("SDF: " + f);
		Protector.println("SPD: " + g);
		Protector.println("CRT: " + h + "%");
		Protector.close();	
	}
}
