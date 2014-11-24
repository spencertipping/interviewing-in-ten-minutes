for (int i = 1; i < 100; ++i) {
  final boolean by3 = i % 3 == 0;
  final boolean by5 = i % 5 == 0;
  if (by3 && by5)
    println("fizzbuzz");
  else if (by5)
    println("buzz");
  else if (by3)
    println("fizz");
  else
    println(i);
}