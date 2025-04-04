class QBhai:

    def __init__(self):
        self.Queue = []

    def Enqueue(self, x):
        self.Queue.append(x)

    def Dequeue(self):
        if self.isEmpty():
            return "Error: Queue is Empty"
        else:
            x = self.Queue[0]
            del self.Queue[0]
            return x

    def isEmpty(self):
        if len(self.Queue) == 0:
            return True
        else:
            return False

    def First(self):
        if not self.isEmpty():
            return self.Queue[0]

    def Length(self):
        return len(self.Queue)
