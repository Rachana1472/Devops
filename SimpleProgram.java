class SimpleProgram {
    public static void main(String[] args) {
        String name = "Java";
        System.out.println("Hello, " + name);

        int a = 5;
        int b = 3;
        System.out.println("Sum of a and b is: " + (a + b));
    }
}
class Bank {
    public static void main(String[] args) {
        double balance = 1000; // initial balance

        double deposit1 = 500;
        balance += deposit1;
        System.out.println("Deposited: " + deposit1 + " | Balance: " + balance);

        double withdraw1 = 200;
        balance -= withdraw1;
        System.out.println("Withdrawn: " + withdraw1 + " | Balance: " + balance);
    }
}  
class StringLength {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Length = " + s.length());
    }
}
class AltPrime {
    public static void main(String[] args) {
        int c = 0;
        for (int n = 2; n <= 50; n++) {
            boolean p = true;
            for (int i = 2; i < n; i++)
                if (n % i == 0) p = false;

            if (p) {
                c++;
                if (c % 2 != 0)
                    System.out.print(n + " ");
            }
        }
    }
}
class Prime {
    public static void main(String[] args) {
        int n = 7, count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        System.out.println(count == 2 ? "Prime Number" : "Not Prime");
    }
}
class SimpleInterest {
    public static void main(String[] args) {
        int p = 1000, r = 5, t = 2;
        System.out.println("Simple Interest = " + (p * r * t) / 100);
    }
}

class Square {
    public static void main(String[] args) {
        int side = 4;
        System.out.println("Area = " + (side * side));
    }
}
pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
    }
}

pipeline {
    agent any

    stages {
        stage('Sum') {
            steps {
                script {
                    int a = 5
                    int b = 7
                    echo "Sum is: ${a + b}"
                }
            }
        }
    }
}
