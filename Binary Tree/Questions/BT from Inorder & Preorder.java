/*
1) In Preorder, the leftmost element is the root element.
2) Search the ‘root’ in Inorder :
    a) All elements on the left side of root are nodes of left subtree
    b) All elements on the right side of root are nodes of right subtree
3) Again scan the Preorder and look for the first element that matches with the nodes of left subtree.
   This matched element will be the root of left subtree.
4) Again go to the Inorder and look for the left and right subtrees of the current root.
*/