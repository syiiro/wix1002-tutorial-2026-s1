# Tutorial 03 Flow of Control (Selection) - Answers

## Question 1

### a)

```java
int a = 3;
int b = 8;

if (a*b == 27){
  System.out.print("Correct");
}
else{
  System.out.print("False");
}
```

### b)

```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();

if (num%2 == 0){
  System.out.println("This is an even number");
}
else{
  System.out.println("This is an odd number");
  }
```

### c)

```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter a character");
char huruf = sc.nextChar();

if (huruf == 'A' && huruf == 'B' && huruf == 'C' && huruf == 'D' && huruf == 'E' && huruf == 'F' && huruf == 'G' && huruf == 'H' && huruf == 'I' && huruf == 'J' && huruf == 'K' && huruf == 'L' && huruf == 'M' && huruf == 'N' && huruf == 'O' && huruf == 'P' && huruf == 'Q' && huruf == 'R' && huruf == 'S' && huruf == 'T' && huruf == 'U' && huruf == 'V' && huruf == 'W' && huruf == 'X' && huruf == 'Y' && huruf == 'Z'){
  System.out.println("This is a capital letter");
}
else{
  System.out.println("This is not a capital letter")
}
```

### d)

```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first word");
String first = sc.next();

System.out.println("Enter the second word");
String second = sc.next();

if (first.compareToIgnoreCase(second) <= 0){
  System.out.println("Result : " + first + " " + second);
}
else {
  System.out.println("Result : " + second + " " + first);
}
```

### e)

```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int num = sc.nextInt();

switch (num) {
  case 1:
    System.out.println("Sunday");
    break;
  case 2:
    System.out.println("Monday");
    break;
  case 3:
    System.out.println("Tuesday");
    break;
  case 4:
    System.out.println("Wednesday");
    break;
  case 5:
    System.out.println("Thursday");
    break;
  case 6:
    System.out.println("Friday");
    break;
  case 7:
    System.out.println("Saturday");
    break;
  default;
    System.out.println("Invalid input!");
}
```



