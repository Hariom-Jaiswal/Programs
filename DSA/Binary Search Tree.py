class node:
    def __init__(self, data):
        self.left = None
        self.data = data
        self.right = None


def insert(root, node):
    if root is None:
        root = node
    else:
        if root.data < node.data:
            if root.right is None:
                root.right = node
            else:
                insert(root.right, node)
        else:
            if root.left is None:
                root.left = node
            else:
                insert(root.left, node)


def preorder(root):
    if root:
        print(root.data, end='->')
        inorder(root.left)
        inorder(root.right)

def inorder(root):
    if root:
        inorder(root.left)
        print(root.data, end='->')
        inorder(root.right)


        
r = node(100)
insert(r, node(10))
insert(r, node(110))
preorder(r)
print("\n")
inorder(r)
