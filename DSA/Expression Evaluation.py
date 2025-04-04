import Stacky

def Brackets(expr):
    S = Stacky.Stack()

    lefty = "([{"
    righty = ")]}"

    for x in expr:
        if x in lefty:
            S.push(x)

        elif x in righty:
            if S.isEmpty():
                return False
            
            elif righty.index(x) != lefty.index(S.pop()):
                return False

    return S.isEmpty()


####
def ConvertPostFix(expr):
    S = Stacky.Stack()
    PostExpr = ""

    lefty = "([{"
    righty = ")]}"

    prece = {"-":0, "+":1, "*":2, "/":3, "^":4}

    for x in expr:
        if x in lefty:
            S.push(x)

        elif x in righty:
            while S.top() not in lefty:
                PostExpr = PostExpr + S.pop()
            S.pop()

        elif x in prece.keys():
            while S.top() in prece.keys() and prece[x] < prece[S.top()]:
                PostExpr = PostExpr + S.pop()
            S.push(x)

        else:
            PostExpr = PostExpr + x

    while not S.isEmpty():
        PostExpr = PostExpr + S.pop()

    return PostExpr


####
def EvalPostFix(PostExpr):
    S = Stacky.Stack()
    Operator = "^/*-+"

    for x in PostExpr:
        if x not in Operator:
            S.push(x)
        else:
            op2 = int(S.pop())
            op1 = int(S.pop())
            
            if x == "^":
                S.push(op1**op2)
            elif x == "/":
                S.push(op1/op2)
            elif x == "*":
                S.push(op1*op2)
            elif x == "+":
                S.push(op1+op2)
            elif x == "-":
                S.push(op1-op2)

    return S.top()


#### 
def Solve(expr):

    if Brackets(expr):
        PostExpr = ConvertPostFix(expr)
        Answer = EvalPostFix(PostExpr)
        print("PostFix: ", PostExpr)
        print("Answer: ", Answer)
    else:
        return "Error: Expression Sytnax"
    

####
Solve("2-3")

    
