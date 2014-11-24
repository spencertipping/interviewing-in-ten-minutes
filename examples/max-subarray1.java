// return [offset, length]
int[] subarray(final int[] xs) {
  int nextUntried  = 1;
  int maxSum       = 0;
  int maxSumStart  = -1;
  int maxSumLength = 0;
  for (int i = 1; i < xs.length; i = nextUntried) {
    maxSumStart  = -1;
    maxSumLength = 1;
    while (i + maxSumStart >= 0 && xs[i + maxSumStart] >= 0) {
      --maxSumStart;
      ++maxSumLength;
    }
    i += maxSumStart;
    while (i + maxSumLength < xs.length
           && xs[i + maxSumLength] >= 0)
      ++maxSumLength;
    nextUntried = i + maxSumLength + 1;
  }
  return new int[] {maxSumStart, maxSumLength};
}