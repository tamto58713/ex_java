package main;

public class Fraction {
	private int numerator;
	private int denomirator;

	public Fraction() {
		this.numerator = 0;
		this.denomirator = 1;
	}

	public Fraction(int a, int b) {
		this.numerator = a;
		if (b == 0) {
			a = 0;
			b = 1;
		}
		this.denomirator = b;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenomirator() {
		return denomirator;
	}

	public void setDenomirator(int denomirator) {
		this.denomirator = denomirator;
	}

	private int GCD(int a, int b) {
		while (b != 0) {
			a = a % b;
			int temp = b;
			b = a;
			a = temp;
		}

		return a;
	}

	public Fraction minimalize(Fraction a) {
		int gcm = GCD(a.getNumerator(), a.getDenomirator());
		a.setNumerator(a.getNumerator() / gcm);
		a.setDenomirator(a.getDenomirator() / gcm);
		return a;
	}

	public Fraction addition(Fraction a, Fraction b) {

		a = a.minimalize(a);
		b = b.minimalize(b);

		int gcd = GCD(a.getDenomirator(), b.getDenomirator());
		int lcm = (a.getDenomirator() * b.getDenomirator()) / gcd;

		a.setNumerator(a.getNumerator() * (lcm / a.getDenomirator()));
		b.setNumerator(b.getNumerator() * (lcm / b.getDenomirator()));

		a.setDenomirator(lcm);
		b.setDenomirator(lcm);

		int numerator = a.getNumerator() + b.getNumerator();
		int denomirator = a.getDenomirator();

		Fraction c = new Fraction(numerator, denomirator);
		c = c.minimalize(c);
		return c;
	}

	public Fraction subtraction(Fraction a, Fraction b) {
		a = a.minimalize(a);
		b = b.minimalize(b);

		int gcd = GCD(a.getDenomirator(), b.getDenomirator());
		int lcm = (a.getDenomirator() * b.getDenomirator()) / gcd;

		a.setNumerator(a.getNumerator() * (lcm / a.getDenomirator()));
		b.setNumerator(b.getNumerator() * (lcm / b.getDenomirator()));

		a.setDenomirator(lcm);
		b.setDenomirator(lcm);

		int numerator = a.getNumerator() - b.getNumerator();
		int denomirator = a.getDenomirator();

		Fraction c = new Fraction(numerator, denomirator);
		c = c.minimalize(c);
		return c;
	}

	public Fraction multiple(Fraction a, Fraction b) {

		a = a.minimalize(a);
		b = b.minimalize(b);

		int numerator = a.getNumerator() * b.getNumerator();
		int denomirator = a.getDenomirator() * b.getDenomirator();

		Fraction c = new Fraction(numerator, denomirator);
		c = c.minimalize(c);
		return c;
	}

	public Fraction divition(Fraction a, Fraction b) {

		a = a.minimalize(a);
		b = b.minimalize(b);

		int numerator = a.getNumerator() * b.getDenomirator();
		int denomirator = a.getDenomirator() * b.getNumerator();

		Fraction c = new Fraction(numerator, denomirator);
		c = c.minimalize(c);
		return c;
	}

	public void show() {
		System.out.println(this.getNumerator() + "\n" + this.getDenomirator());
	}

	public String commpareFractions(Fraction a, Fraction b) {

		a = a.minimalize(a);
		b = b.minimalize(b);

		int gcd = GCD(a.getDenomirator(), b.getDenomirator());
		int lcm = (a.getDenomirator() * b.getDenomirator()) / gcd;

		a.setNumerator(a.getNumerator() * (lcm / a.getDenomirator()));
		b.setNumerator(b.getNumerator() * (lcm / b.getDenomirator()));

		a.setDenomirator(lcm);
		b.setDenomirator(lcm);
		
		int numA = a.getNumerator();
		int numB = b.getNumerator();
		
		
		if (numA > numB)
			return ">";
		else if (numA < numB)
			return "<";
		else
			return "=";
	
		
	}
}
