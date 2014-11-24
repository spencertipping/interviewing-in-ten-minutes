interface OurList {
  int head();
  OurList tail();
}
long sum(OurList xs) {
  long total = 0;
  for (; xs != null; xs = xs.tail())
    total += xs.head();
  return total;
}