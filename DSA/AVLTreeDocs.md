# AVL Tree

An AVL tree (Adelson-Velsky and Landis) is a self-balancing Binary Search Tree (BST) where the difference between heights of left and right subtrees cannot be more than one for all nodes.

## Properties
-   **Height Balanced**: For every node, $|height(left) - height(right)| \le 1$.
-   **Rotations**: Uses Left, Right, Left-Right, and Right-Left rotations to maintain balance during insertion and deletion.

## Operations
-   **Insertion**: Same as BST insertion, followed by re-balancing.
-   **Deletion**: Same as BST deletion, followed by re-balancing.
-   **Search**: Same as BST.

## Complexity
-   **Time Complexity**:
    -   search/insert/delete: $O(\log n)$ (guaranteed due to balancing)
-   **Space Complexity**: $O(n)$

## Advantage
Unlike a standard BST, AVL trees guarantee $O(\log n)$ time complexity even in the worst case (no skewing).
