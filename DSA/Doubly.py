class node:
    def __init__(self, data):
        self.back = None
        self.data = data
        self.front = None

class Doubly:
    def __init__(self):
        self.head = None

    def insert(self, data):
        NewNode = node(data)

        if self.head is None:
            self.head = NewNode

        else:
            self.iterateNode = self.head
            while self.iterateNode.front != None:
                self.iterateNode = self.iterateNode.front

            self.iterateNode.front = NewNode
            NewNode.back = self.iterateNode

    def displayForward(self):
        self.iterateNode = self.head
        while self.iterateNode.front != None:
            print(self.iterateNode.data, "-> ", end='')
            self.iterateNode = self.iterateNode.front
        print(self.iterateNode.data, "-> None")

    def displayBackward(self):
        while self.iterateNode.back != self.head.back:
            print(self.iterateNode.data, "-> ", end='')
            self.iterateNode = self.iterateNode.back
        print(self.head.data,"-> None")

    def remove(self):
        self.iterateNode = self.head
        while self.iterateNode.front.front != None:
            self.iterateNode = self.iterateNode.front
        self.iterateNode.front = None
        

#Output
a = Doubly()
a.insert(1)
a.insert(2)
a.insert(3)
a.insert(4)
a.insert(5)
a.displayForward()
#1 -> 2 -> 3 -> 4 -> 5 -> None
a.displayBackward()
#5 -> 4 -> 3 -> 2 -> 1 -> None
a.remove()
a.displayForward()
