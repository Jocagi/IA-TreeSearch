package org.example;

import org.example.graph.Node;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Node<String> nodo1 = new Node<String>("Hola");
        Node<Integer> nodo2 = new Node<Integer>(5);
        var nodo3 = new Node<Boolean>(true);

        System.out.println( nodo1 );
        System.out.println( nodo2 );
    }
}
