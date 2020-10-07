a=range(1, 10)
map(print,[[f'{i} x {j} = {i*j}' for j in a] for i in a])