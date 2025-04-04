class Stack:

    def __init__(self):
        self.Stack = []

    def push(self, x):
        self.Stack.append(x)

    def pop(self):
        if self.isEmpty():
            return "Error: Stack Empty"
        else:
            x = self.Stack[-1]
            del self.Stack[-1]
            return x

    def isEmpty(self):
        if len(self.Stack) == 0:
            return True
        else:
            return False

    def length(self):
        return len(self.Stack)

    def top(self):
        if not self.isEmpty():
            return self.Stack[-1]
