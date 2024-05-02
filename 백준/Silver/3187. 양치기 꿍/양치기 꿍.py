import sys
sys.setrecursionlimit(10**6)

R, C = map(int, input().split())

graph = []
for i in range(R):
  graph.append(list(input()))

sheep = 0
wolf = 0

def dfs(x, y):
  global sheep, wolf
  if x <= -1 or x >= R or y <= -1 or y >= C:
    return False
  if graph[x][y] != '#':
    if graph[x][y] == 'v':
      wolf += 1
    elif graph[x][y] == 'k':
      sheep += 1
    
    # 해당 노드 방문 처리
    graph[x][y] = '#'

    # 상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
    dfs(x - 1, y)
    dfs(x, y - 1)
    dfs(x + 1, y)
    dfs(x, y + 1)

    return True
  return False



sh_result = 0
wol_result = 0

for i in range(R):
  for j in range(C):
    if dfs(i, j) == True:
      if sheep > wolf:
        sh_result += sheep
      else:
        wol_result += wolf

      sheep = 0
      wolf = 0


print(sh_result, wol_result)
    