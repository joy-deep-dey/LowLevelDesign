package com.joy.design_patterns.composite;

import com.joy.design_patterns.composite.node.CompositeNodeManager;
import com.joy.design_patterns.composite.node.LeafNodeDeveloper;

public class Main {
    public static void main(String[] args) {
        LeafNodeDeveloper alice=new LeafNodeDeveloper("Alice");
        LeafNodeDeveloper bob=new LeafNodeDeveloper("Bob");

        CompositeNodeManager manager = new CompositeNodeManager("Jim");
        manager.add(alice);
        manager.add(bob);

        CompositeNodeManager ceo = new CompositeNodeManager("CEO");
        ceo.add(manager);

//        alice.showDetails();
//        manager.showDetails();
        ceo.showDetails();
    }
}
