# Tutorial 03 Flow of Control (Selection) - Answers

## Question 1

### a)

```java
int a = 3, b = 8;

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

## Question 2

### a)

```java
  if (num1 == num2); 
    System.out.println("Number 1 is equal to number 2."); 
```

### b)

```java
  if (x > y && x > z);     
    System.out.println("x is the largest number"); 
```

### c)

```java
String s1 = "Mak", s2 = "Ayah";
if (s1.equals(s2)){
    System.out.println("They are equal strings.");
}
else{
    System.out.println("They are not equal strings.");
}
```

### d)

```java
  if (x > 0 || y > 0); 
    System.out.println("Either x or y is positive"); 
```

## Question 3

### a)

```java
#####
$$$$$
```

First, it checks the x < 10 condition and its true as x = 9. Then it checks for y > 10 condition, but as y is equal to 10, it will run the else command and exit the if y > 10. Finally, it will print the $$$$$ as it is a separate command that isnt bound to any loop.

### b)

```java
#####
$$$$$
```

Just like question 1, it checks every if loop condition but this time condition for y is y < 10, it will run the else command and exit the if y < 10 loop.

### c)

```java
#####
```

This time the line System.out.println("#####") sits under the if (x < 10) loop as there is no curly bracket after if (y < 10) loop to control the line after it.

### d)

```java
  
```

The output is empty because (x > 10) so it skips to the next line. But the thing is, the else statement is enclose inside the (x > 10) loop WHICH MEAN it is UNDER the (y > 10) loop.

## Question 4

```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter the first number");
int a = sc.nextInt();

System.out.println("Enter the second number");
int b = sc.nextInt();

System.out.println("Enter the third number");
int c = sc.nextInt();

if (a >= b && a >= c){
  System.out.println(a + " is the biggest number!");
}
  else if (b >= a && b >= c){
    System.out.println(b + " is the biggest number!");
    }
  else{
    System.out.println(c + " is the biggest number!");
}
```

## Question 5

```java
Scanner sc = new Scanner(System.in);
System.out.println("Enter the current year");
int year = sc.nextInt();

if (year % 4 == 0 && year % 100 != 0){
  System.out.println("This year is a Leap Year!");
}
else if (year % 400 == 0){
  System.out.println("This year is a Leap Year!")
}
else{
  System.out.println("This year is not a Leap Year.");
}
```
