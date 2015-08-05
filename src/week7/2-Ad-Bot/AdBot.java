package week7;

public class AdBot {
	public String[] s;
	Queue<String> ads = new Queue<>();

	public void addAdds(String[] s) {
		for (int i = 0; i < s.length; i++) {
			ads.push(s[i]);
		}
	}

	public AdBot(String[] s) {
		this.s = s;
		addAdds(s);
	}

	public void showNextAdd() {
		String temp = ads.peek();
		System.out.println(temp);
		ads.push(temp);
		ads.pop();

	}

}
