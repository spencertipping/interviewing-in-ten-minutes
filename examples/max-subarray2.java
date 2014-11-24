int[] subarray(int[] xs) {
  // modify xs in place (!)
  for (int i = 0, total = 0; i < xs.length; ++i)
    xs[i] = total += xs[i];

  int max = 0;
  int min = 0;
  for (int i = 1; i < xs.length; ++i) {
    if (xs[i] > xs[max]) max = i;
    if (xs[i] < xs[min]) min = i;
  }
  return new int[] {Math.min(min, max),
                    Math.max(min, max) - Math.min(min, max)};
}