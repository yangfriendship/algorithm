import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();

		long x = 1000000000 + n;
		long y = 1 + n;
		System.out.println((int) Math.floor(y * 100 / x));

	}

}
