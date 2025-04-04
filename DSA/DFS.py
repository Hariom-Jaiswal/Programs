#DFS (Recursive)
def DFSr(graph, start, visited=None):

    if visited is None:
        visited = []

    if start not in visited:
        print(start, end="->")
        visited.append(start)

        for neigh in graph[start]:
            DFSr(graph, neigh, visited)


#DFS (Iterative/ Stack)
import Stacky

def DFSs(graph, start):
    visited = []

    S = Stacky.Stack()
    S.push(start)

    while not S.isEmpty():
        vertex = S.pop()
        if vertex not in visited:
            print(vertex, end="->")
            visited.append(vertex)
            
        for neigh in reversed(graph[vertex]):
            if neigh not in visited:
                S.push(neigh)
        
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
}

DFSr(graph, "A")
print("\n")
DFSs(graph, "A")
