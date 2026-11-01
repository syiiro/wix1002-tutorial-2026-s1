# Tutorial 4 Flow of Control (Repetition) - Answers

## Question 1

### a)

```java
        int i = 0;
        
        while((i*i*i) < 2000){
            i++;
            System.out.println(i);
```

### b)

```java
        int i = 1;
        
        while(i <= 12){
            int square = i*i;
            System.out.println("Square number of " + i + " is : " + square);
            i++;
```

### c)

```java
        Random rand = new Random();
        
        for(int row = 1; row <= 4; row++){
            for(int col = 1; col <= 5; col++){
                System.out.printf("%5d", rand.nextInt(101));
            }
            System.out.println("");
    }
```

### d)

```java
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int i = 0;
        int result = 0;
        
        while(i <= number){
            result += i;
            System.out.println("The sum of number is : " + result);
            i++;
```

### e)

```java
        double result = 0;
        
        for(int i = 1; i <= 25; i++){
            result += i / (26 - i);
        } 
        System.out.printf("%.2f", result);
```

## Question 2

### a)

## Question :

```java
for (x = 10; x > 0; x++) 
  sum += x; 
```

## Answer :

```java
for(int x = 10; x > 0; x++) 
  sum += x; 
```

### b)

## Question :

```java
do 
  x += 2; 
  y += x; 
  System.out.println(x + " and " + y); 
while (x < 100)
```

## Answer :

```java
int x = 0;
int y = 0;

do {
  x += 2; 
  y += x; 
  System.out.println(x + " and " + y);
}
while (x < 100);
```

### c)

## Question :

```java
for ( x==1, y==20; x < y, x++, y-=2); 
  System.out.println(x & " " & y); 
```

## Answer :

```java
int x = 0;
int y = 0;

for(x = 1, y = 20; x < y; x++, y -= 2){ 
  System.out.println(x & " " & y);
}
```

### d)

## Question :

```java
i =1; 
  while(i<10) { 
    if (i==10) 
      System.out.println("Program End"); 
}
```

## Answer :

```java
int i = 1;
 
  while(i <= 10){ 
    if (i == 10){
      System.out.println("Program End"); 
  }
  i++;
}
```

## Question 3

```java
int i = 1;
int j = 1;

  System.out.println(i);
  System.out.println(j);

  for (int x = 3; x <= 10; x++){
    int next = i + j;   
    System.out.println(next);
    i = j;              
    j = next;
}
System.out.println();
```

## Question 4

```java
        import java.util.Scanner;

        System.out.println("Enter a string");
        String input = sc.next();
        
        String after = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            after += input.charAt(i);
        }
        System.out.println("Before : " + input );
        System.out.println("After : " + after );
```



