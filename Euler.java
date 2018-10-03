import java.util.Scanner;
public class Euler {
	public static void solve(){
		Scanner in = new Scanner(System.in);
		System.out.print("n: ");
		int n = in.nextInt();
		System.out.print("x0: ");
		double x = in.nextDouble();
		System.out.print("y0: ");
		double y = in.nextDouble();
		System.out.print("h: ");
		double h = in.nextDouble();
		
		System.out.printf("%5s %15s %15s %s", "n", "x", "y", "\n");
		for(int i = 1; i <= n; i++){
			y += h*(2*x/y);
			x += h;
			System.out.printf("%5d %15.4f %15.4f %s", i, x, y, "\n");
		}
		System.out.print("\n");
	}
	public static void main(String[]args){
		Euler.solve();
	}
}
