package no.obrien.dsaa.datastructures.collections.trees;

import no.obrien.dsaa.datastructures.collections.Collection;

public class BinarySearchTree<T> implements Collection<T> {

  private TreeNode<T> root;

  @Override
  public void add(T item) {
    if (this.root == null) {
      this.root = new TreeNode<>(item);
    } else {
    }
  }

  @Override
  public void remove(T item) {
  }

  @Override
  public int size() {
    return 0;
  }

  @Override
  public void clear() {
  }

  @Override
  public boolean contains(T item) {
    return false;
  }

  static class TreeNode<T> {

    private final T value;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value) {
      this.value = value;
    }

    public TreeNode<T> getLeft() {
      return this.left;
    }

    public void setLeft(TreeNode<T> treeNode) {
      this.left = treeNode;
    }

    public TreeNode<T> getRight() {
      return this.right;
    }

    public void setRight(TreeNode<T> treeNode) {
      this.right = treeNode;
    }

    public T getValue() {
      return this.value;
    }
  }

}
