interface OurList {
  int head();
  OurList tail();
}
int sum(OurList list) {
  if (list == null)
    return 0;
  else
    return list.head() + sum(list.tail());
}