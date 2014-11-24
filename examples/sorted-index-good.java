SortedMap<String, List<Integer>> index(final List<Tuple> tuples) {
  final SortedMap<...> result = new TreeMap<>();
  for (final Tuple t : tuples) {
    if (result.containsKey(t.word))
      result.get(t.word).add(t.page);
    else
      result.put(t.word, new ArrayList<Integer>(t.page));
  }
  return result;
}