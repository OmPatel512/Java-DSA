package Recursion;

public class Main {
    public static void main(String[] args) {
        Main r = new Main();
        var t = r.decToBinary(10);
        System.out.println(t);

    }

public int factorial(int n) {
    if(n < 0) {
    return -1;
    }

    if (n==0 || n==1) {
        return 1;
    }
    return n* factorial(n-1);
}

public int fibonacci(int n) {
    if(n < 0) {
    return -1;
    }

    if (n==0 || n==1) {
        return n;
    }

    return fibonacci(n-1) + fibonacci(n-2);
}

public int sumOfDigits(int n) {
    if (n == 0 || n<0){
        return 0;
    }

    return (n%10 + sumOfDigits(n/10));
}

public int power(int n, int exp) {
    if (exp < 0) {
        return -1;
    }
    if (exp == 0) {
        return 1;
    }
    if (exp == 1) {
        return n;
    }
    return n * power(n, exp-1);
}

public int gcd(int n, int m) {
    if (n<0 || m<0) {
        return -1;
    }

    if (m == 0) {
        return n;
    }
    return gcd(m, n%m);
}

public int decToBinary(int n) {
    if (n == 0) {
        return 0;
    }
    return n%2 + (10*decToBinary(n/2));
}

}
