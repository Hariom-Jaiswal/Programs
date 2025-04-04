class node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def insert(self, data):
        NewNode = node(data)

        if self.head == None:
            self.head = NewNode 
        else:
            self.iterateNode = self.head
            while self.iterateNode.next != None:
                self.iterateNode = self.iterateNode.next
            self.iterateNode.next = NewNode

    def remove(self):
        if self.head == None:
            print("Error: Empty List")
            
        elif self.head.next != None:
            self.head.next = None

        else:
            self.iterateNode = self.head
            while self.iterateNode.next.next != None:
                self.iterateNode = self.iterateNode.next
            self.iterateNode.next = None
            
    def display(self):
        self.iterateNode = self.head
        while self.iterateNode.next != None:
            print(self.iterateNode.data, "-> ", end='')
            self.iterateNode = self.iterateNode.next
            
        print(self.iterateNode.data, "-> None")
