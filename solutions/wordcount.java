int wordcount(final String s) {
  boolean inWord = false;
  int     words  = 0;
  for (int i = 0; i < s.length; ++i) {
    final char c = s.charAt(i);
    if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
      if (!inWord)
        ++words;
      inWord = true;
    } else
      inWord = false;
  }
  return words;
}