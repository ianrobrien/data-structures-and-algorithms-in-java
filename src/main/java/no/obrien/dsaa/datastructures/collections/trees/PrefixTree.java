package no.obrien.dsaa.datastructures.collections.trees;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import no.obrien.dsaa.datastructures.collections.Collection;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class PrefixTree implements Collection<String> {

  private final PrefixTreeNode root;
  private int size;

  public PrefixTree() {
    this.root = new PrefixTreeNode(null, new HashMap<>());
  }

  @Override
  public void add(String item) {
    add(item, 0, this.root);
  }

  private void add(String value, int keyIndex, PrefixTreeNode node) {
    if (keyIndex == value.length()) {
      this.size++;
      return;
    }
    char key = value.charAt(keyIndex);
    if (!node.getChildren().containsKey(key)) {
      node.getChildren()
          .put(key, new PrefixTreeNode(value.substring(0, keyIndex + 1)));
    }
    this.add(value, keyIndex + 1, node.getChildren().get(key));
  }

  @Override
  public void remove(String item) {
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public void clear() {
  }

  @Override
  public boolean contains(String item) {
    return this.contains(item, 0, this.root);
  }

  private boolean contains(String value, int keyIndex, PrefixTreeNode node) {
    if (node == null) {
      return false;
    }
    if (node.getValue() != null && node.getValue().equals(value)) {
      return true;
    }
    return this.contains(value, keyIndex + 1, node.getChildren().get(value.charAt(keyIndex)));
  }

  @RequiredArgsConstructor
  @Getter
  private class PrefixTreeNode {

    private final String value;
    private final Map<Character, PrefixTreeNode> children;

    public PrefixTreeNode(String value) {
      this.value = value;
      this.children = new HashMap<>();
    }
  }
}
