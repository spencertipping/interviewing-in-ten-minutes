boolean geometric(final double[] xs) {
  if (xs.length < 2)
    return true;
  if (xs[0] == 0) {
    for (int i = 0; i < xs.length; ++i)
      if (xs[i] != 0)
        return false;
    return true;
  }

  final double ratio = xs[1] / xs[0];
  for (int i = 2; i < xs.length; ++i)
    if (Math.abs(xs[i] / xs[i - 1] - ratio) > EPSILON)
      return false;
  return true;
}