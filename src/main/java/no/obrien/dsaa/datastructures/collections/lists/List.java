package no.obrien.dsaa.datastructures.collections.lists;

import no.obrien.dsaa.datastructures.collections.Collection;

public interface List<T> extends Collection<T> {

  T get(int index);
}
