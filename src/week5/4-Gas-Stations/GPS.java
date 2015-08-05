package week5;

import java.util.Scanner;
import java.util.Vector;

public class GPS {

//	public int tripDistance;
//	public int tankSize;
//	public int gasStationsCount;
//	public Vector<Integer> gasStations;

	public static Vector<Integer> getGasStations(int tripDistance,
			int tankSize, Vector<Integer> gasStations) {
		Vector<Integer> result = new Vector<Integer>();
		int temp = tankSize - gasStations.elementAt(0);
		gasStations.add(tripDistance);

		for (int i = 0; i < gasStations.size() - 1; i++) {

			int distance = gasStations.elementAt(i + 1)
					- gasStations.elementAt(i);

			if (temp < distance) {
				result.add(gasStations.elementAt(i));
				temp = tankSize - distance;

			} else if (temp > distance) {
				temp = temp - distance;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tripDistance = scanner.nextInt();
		int tankSize = scanner.nextInt();

		int gasStationsCount = scanner.nextInt();
		Vector<Integer> gasStations = new Vector<Integer>();

		for (int i = 0; i < gasStationsCount; i++) {
			gasStations.add(scanner.nextInt());
		}

		Vector<Integer> result = getGasStations(tripDistance, tankSize,
				gasStations);

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}

}
