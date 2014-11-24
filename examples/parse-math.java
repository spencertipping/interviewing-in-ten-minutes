double parsemath(final String expr) {
  double left  = 0;
  double right = 1;
  for (int i = 0; i < expr.length(); ++i) {
    final char c = expr.charAt(i);
    switch (c) {
      case '+':
        left += right;
        right = 1;
        break;
      case '*':
        break;
      default:
        right *= c - '0';
        break;
    }
  }
  return left + right;
}