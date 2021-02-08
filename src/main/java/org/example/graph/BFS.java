package org.example.graph;

import java.util.*;

public class BFS
{
    public static<T> Optional<Node<T>> search(T value, Node<T> start)
    {
        Queue<Node<T>> queue = new ArrayDeque<>();
        queue.add(start);

        Node<T> currentNode;
        Set<Node<T>> closed = new HashSet<>();

        //1 - Verificar si puede cnontinuar
        while(!queue.isEmpty())
        {
            currentNode = queue.remove();
            System.out.println("Visitando el nodo " + currentNode.toString());

            //2 - Verificar si se encuentra en la meta
            if(currentNode.getValue().equals(value))
            {
                return Optional.of(currentNode);
            }
            else
            {
                closed.add(currentNode); //3 - Agregar al espacio explorado
                queue.addAll(currentNode.getNeighbors()); //4 - Nodos sucesores
                queue.removeAll(closed);
            }
        }
        return Optional.empty();
    }
}
