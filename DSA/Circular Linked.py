class node:
    def __init__(self, data):
        self.data = data
        self.next = None


class CircularLinked:
    def __init__(self):
        self.head = None

    def insert(self, data):
        NewNode = node(data)

        if self.head is None:
            self.head = NewNode
            NewNode.next = self.head

        else:
            self.iterateNode = self.head
            while self.iterateNode.next != self.head:
                self.iterateNode = self.iterateNode.next

            self.iterateNode.next = NewNode
            NewNode.next = self.head

    def display(self):
        self.iterateNode = self.head
        while self.iterateNode.next != self.head:
            print(self.iterateNode.data, "-> ", end='')
            self.iterateNode = self.iterateNode.next
        print(self.iterateNode.data,"->",self.iterateNode.next.data, "(Head)")


    def remove(self):
        self.iterateNode = self.head
        while self.iterateNode.next.next != self.head:
            self.iterateNode = self.iterateNode.next

        self.iterateNode.next = self.head

            
#Output
a = CircularLinked()
a.insert(5)
a.insert(4)
a.insert(3)
a.insert(2)
a.insert(1)
a.display()

a.remove()
a.display()
