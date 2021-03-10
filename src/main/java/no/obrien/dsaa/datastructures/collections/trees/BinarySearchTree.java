package no.obrien.dsaa.datastructures.collections.trees;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import no.obrien.dsaa.datastructures.collections.Collection;

public class BinarySearchTree<T extends Comparable<T>> implements Collection<T> {

  private TreeNode<T> root;
  private int size;

  @Override
  public void add(T item) {
    if (this.root == null) {
      this.root = new TreeNode<>(item);
      this.size++;
    } else {
      this.add(item, this.root);
    }
  }

  private void add(T item, TreeNode<T> node) {
    if (item.compareTo(node.getValue()) > 0) {
      if (node.getRight() == null) {
        node.setRight(new TreeNode<>(item));
        this.size++;
      } else {
        this.add(item, node.getRight());
      }
    } else {
      if (node.getLeft() == null) {
        node.setLeft(new TreeNode<>(item));
        this.size++;
      } else {
        this.add(item, node.getLeft());
      }
    }
  }

  @Override
  public void remove(T item) {
  }

  @Override
  public int size() {
    return this.size;
  }

  @Override
  public void clear() {
  }

  @Override
  public boolean contains(T item) {
    if (this.root == null) {
      return false;
    } else {
      return this.contains(item, this.root);
    }
  }

  private boolean contains(T item, TreeNode<T> tTreeNode) {
    if (tTreeNode == null) {
      return false;
    }
    int compareToResult = item.compareTo(tTreeNode.getValue());
    return compareToResult == 0 ||
        this.contains(item, compareToResult < 0 ? tTreeNode.getLeft() : tTreeNode.getRight());
  }

  @Data
  @RequiredArgsConstructor
  static class TreeNode<T extends Comparable<T>> {

    private final T value;
    private TreeNode<T> left;
    private TreeNode<T> right;
  }
}
