package org.example.graph;

import java.util.*;

public class NodePath<T>
{
    private final Node<T> node;
    private final Queue<Node<T>> path;

    public NodePath(Node<T> node, Queue<Node<T>>path)
    {
        this.node = node;
        this.path = path;
    }

    public Node<T> getNode()
    {
        return node;
    }

    public Queue<Node<T>> getPath()
    {
        return new ArrayDeque<>(path);
    }
}
