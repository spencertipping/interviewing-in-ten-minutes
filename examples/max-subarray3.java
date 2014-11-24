int[] subarray(final int[] xs) {
  if (xs.length == 0)
    return null;
  int max      = 0;
  int min      = 0;
  int maxValue = xs[0];
  int minValue = xs[0];
  for (int i = 1, sum = xs[0]; i < xs.length; ++i) {
    sum += xs[i];
    if (sum < minValue) {
      minValue = maxValue = sum;
      min      = max      = i;
    }
    if (sum > maxValue) {
      maxValue = sum;
      max      = i;
    }
  }
  return new int[] {min, max - min};
}