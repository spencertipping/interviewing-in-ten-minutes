List index(List tuples) {
  HashMap resultIndex = new HashMap();
  for (int i = 0; i < tuples.size(); ++i) {
    if (!resultIndex.contains(tuples[i].word))
      resultIndex.add(tuples[i].word, new LinkedList());
    resultIndex.get(tuples[i].word).add(tuples[i].page);
  }
  List sortedResult = new ArrayList();
  Iterator iterator = resultIndex.iterator();
  while (iterator.hasNext()) {
    Tuple indexEntry = iterator.next();
    sortedResult.add(indexEntry);
  }
  quicksort(sortedResult);
  return sortedResult;
}