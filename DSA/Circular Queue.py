class CircularQ:

    def __init__(self, maxSize):
        self.max = maxSize
        self.cirQ = [None] * self.max
        self.head = self.tail = 0
        self.count = 0

    def isFull(self):
        if self.count == self.max:
            return True
        else:
            return False


    def Length(self):
        return self.count


    def Enqueue(self, x):
        if self.isFull():
            return "Error: Queue is Full"
        else:
            self.cirQ[self.tail] = x
            self.count += 1
            self.tail = (self.tail + 1) % self.max
            

    def Dequeue(self):
        if self.count == 0:
            return "Error: Queue is Empty"
        else:
            x = self.cirQ[self.head]
            self.cirQ[self.head] = None
            self.count -= 1
            self.head = (self.head + 1) % self.max
            return x
            

    def peek(self):
        return self.cirQ[self.head]

    def Display(self):
        print("Queue: ", self.cirQ)
        print("Head Position: ", self.head)
        print("Tail Position: ", self.tail)
        


#Output
a = CircularQ(5)
a.isFull()
a.Length()
a.Dequeue()
a.Enqueue(5)
a.Enqueue(4)
a.Enqueue(3)
a.Enqueue(2)
a.Enqueue(1)
a.Enqueue(0)
a.Display()

a.Dequeue()
a.Display()

a.Dequeue()
a.Display()
