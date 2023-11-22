<h1>Generic Arrays for java</h1>

An idiomatic, OOP way of making generic arrays in Java. 
<br>
<hr>
Making a generic array with Java Reflection is clunky: <br>

```java
Integer[] myArray = Array.newInstance(class,size)
```
You have to pass the class in with this rather than use idiomatic generic syntax.
<hr>


<h2>With GenericArrays class you can instantiate the array like a normal generic object:</h2>

```java
GenericArray<Integer> myArray = new GenericArray<>(size)
```
