import sys
sys.setrecursionlimit(100000)

testNum = int(input())

def dfs(x, y):
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False
    if graph[x][y] == '#':
        graph[x][y] = '.'
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    return False
                


for t in range(testNum):
  n, m = map(int, input().split())

  graph = []
  for i in range(n):
    graph.append(list(input()))
  
  result = 0
  for i in range(n):
    for j in range(m):
        if dfs(i, j) == True:
            result += 1
  
  print(result)


            