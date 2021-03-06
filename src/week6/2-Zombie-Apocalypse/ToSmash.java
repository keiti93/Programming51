package week6;

public class ToSmash extends Weapon {

	public ToSmash(int damage, int durability) {
		super(damage, durability);

	}

	public int hit() {
		int dmg = damage;
		if (durability >= 0) {
			durability--;
		}

		if (durability <= maxDurability / 2 && damage > 1) {
			damage--;
		}
		return dmg;
	}

	public String getType() {
		return "TO_SMASH";
	}
}
