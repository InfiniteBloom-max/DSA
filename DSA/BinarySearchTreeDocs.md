# Binary Search Tree (BST)

A Binary Search Tree is a node-based binary tree data structure which has the following properties:
-   The left subtree of a node contains only nodes with keys lesser than the node’s key.
-   The right subtree of a node contains only nodes with keys greater than the node’s key.
-   The left and right subtrees must also be binary search trees.

## Operations
-   **Insertion**: Finds the correct position and adds the new node.
-   **Search**: Traverses down looking for the key.
-   **Traversal**: Inorder traversal gives the nodes in sorted order.

## Complexity
-   **Time Complexity**:
    -   search/insert: $O(h)$ where $h$ is the height of the tree.
    -   Average case: $O(\log n)$
    -   Worst case (skewed tree): $O(n)$
-   **Space Complexity**: $O(n)$
