import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.math.*;
public class HeroStats {
	public static void statCalculator() throws FileNotFoundException {
		Scanner in = new Scanner (System.in);
		System.out.println("What level is the protagonist? ");
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
			health = (level * 3.5) + 20;
			trueHealth = (int) Math.round(health);
			specialPoints = (level * 2) + 6;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (level * 4) + 8;
			trueAttack = (int) Math.round(attack);
			defense = (level * 3.5) + 7;
			trueDefense = (int) Math.round(defense);
			specialAttack = (level * 4) + 6;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (level * 3.5) + 6;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (level * 3) + 7;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 20 && level <= 30) {
			levelRange = level - 20;
			health = (levelRange * 4.5) + 90;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 2.5) + 46;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 4.5) + 88;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4) + 77;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 4.5) + 86;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 4) + 76;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 3) + 67;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 30 && level <= 45) {
			levelRange = level - 30;
			health = (levelRange * 6) + 135;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 4) + 71;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5) + 133;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 4.5) + 117;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5) + 131;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 4.5) + 116;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4) + 97;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 45 && level <= 65) {
			levelRange = level - 45;
			health = (levelRange * 7) + 225;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 4.5) + 131;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5.5) + 208;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 5) + 185;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5.5) + 206;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 5) + 184;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4.5) + 157;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 65 && level <= 80) {
			levelRange = level - 65;
			health = (levelRange * 8) + 365;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 4.5) + 221;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 5.5) + 318;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 5.5) + 285;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 5.5) + 316;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 5.5) + 284;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 4.5) + 247;
			trueSpeed = (int) Math.round(speed);
			critChance = level / 4;
			statList(level, trueHealth, trueSpecialPoints, trueAttack, trueDefense, trueSpecialAttack, trueSpecialDefense, trueSpeed, critChance);
		}
		else if(level > 80 && level <= 100) {
			levelRange = level - 80;
			health = (levelRange * 8) + 485;
			trueHealth = (int) Math.round(health);
			specialPoints = (levelRange * 4) + 289;
			trueSpecialPoints = (int) Math.round(specialPoints);
			attack = (levelRange * 6) + 401;
			trueAttack = (int) Math.round(attack);
			defense = (levelRange * 6) + 368;
			trueDefense = (int) Math.round(defense);
			specialAttack = (levelRange * 6) + 399;
			trueSpecialAttack = (int) Math.round(specialAttack);
			specialDefense = (levelRange * 6) + 367;
			trueSpecialDefense = (int) Math.round(specialDefense);
			speed = (levelRange * 5) + 315;
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
		String filename = characterName + "TheHero.txt";
		PrintWriter Hero = new PrintWriter(filename);
		Hero.println(characterName + " the Hero");
		Hero.println("Level: " + n);
		Hero.println("HP: " +  a);
		Hero.println("SP: " +  b);
		Hero.println("ATK: " + c);
		Hero.println("DEF: " + d);
		Hero.println("SPA: " + e);
		Hero.println("SDF: " + f);
		Hero.println("SPD: " + g);
		Hero.println("CRT: " + h + "%");
		Hero.close();
	}
}
