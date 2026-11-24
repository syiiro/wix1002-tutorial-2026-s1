# Tutorial 6 Java Methods - Answers

## Question 1

### a)

```java
    public static int max(int a, int b, int c){
        int max = a;
        
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }
```

### b)

```java
    public static boolean isSquare(int number){
        int root = (int) Math.sqrt(number);
        
        return root * root == number;
    }
```

### c)

```java
    public static long combination(int n, int k){
        long result = 1;
        
        for(int i = 1; i <= k; i++){
            result = result * (n - k + i) / i;
        }
        return result;
    }
```

each division comes out exact, so this overflows much later than computing n! would.

### d)

```java
    public static boolean isPentagonal(int number){
        int n = 1;
        int pentagonal = 1;
        
        while(pentagonal < number){
            n++;
            pentagonal = n * (3 * n - 1) / 2;
        }
        return pentagonal == number;
    }
```

### e)

```java
    public static void countLetterDigit(String text){
        int letters = 0;
        int digits = 0;
        
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            
            if(Character.isLetter(c)){
                letters++;
            }
            else if(Character.isDigit(c)){
                digits++;
            }
        }
        System.out.println("Number of letters : " + letters);
        System.out.println("Number of digits : " + digits);
    }
```

### f)

```java
    public static void generate(int[] numbers){
        Random rand = new Random();
        
        for(int i = 0; i < 10; i++){
            numbers[i] = rand.nextInt(101);
        }
    }
```

the method fills the caller's array, so main can read the numbers after the call. Example : `int[] list = new int[10]; generate(list);`

### g)

```java
    public static void circle(double radius, double[] result){
        result[0] = Math.PI * radius * radius;
        result[1] = 2 * Math.PI * radius;
    }
```

a void method returns nothing, so the results go into the array. result[0] holds the area and result[1] holds the circumference.

### h)

```java
    public static int firstRepeat(){
        Random rand = new Random();
        boolean[] seen = new boolean[11];
        int number = rand.nextInt(11);
        
        while(!seen[number]){
            seen[number] = true;
            number = rand.nextInt(11);
        }
        return number;
    }
```

seen records the numbers that already came out, and the loop stops at the first one that comes out again.

## Question 2

```java
import java.util.Scanner;

    public static void decreasing(int a, int b, int c){
        int temp;
        
        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        if(b < c){
            temp = b;
            b = c;
            c = temp;
        }
        if(a < b){
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println(a + " " + b + " " + c);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        decreasing(x, y, z);
    }
```
