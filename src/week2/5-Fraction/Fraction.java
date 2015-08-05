package week2;

public class Fraction {
	public int num;
	public int den;

	public String toString() {
		return num + "/" + den;
	}

	public double getReal() {
		return (double) this.num / this.den;
	}

	public void sum(Fraction F) {
		int newNum;
		int nok = this.den * F.den / (nok(this.den, F.den));
		if (F.den == nok) {
			newNum = this.num * (nok / this.den) + F.num;
		} else {
			newNum = F.num * (nok / F.den) + this.num;
		}
		int newDen = nok;
		System.out.println(newNum + "/" + newDen);
	}

	public void simplify() {
		int nok = nok(this.num, this.den);
		System.out.println((this.num / nok) + "/" + (this.den / nok));
	}

	public int nok(int td, int fd) {
		while (td != fd) {
			if (td > fd) {
				td -= fd;
			} else {
				fd -= td;
			}
		}
		return td;
	}

	public static void main(String[] args) {
		Fraction a = new Fraction();
		a.num = 4;
		a.den = 12;

		Fraction b = new Fraction();
		b.num = 5;
		b.den = 24;

		System.out.println(a);
		System.out.println(a.getReal());
		a.sum(b);
		a.simplify();

	}
}
