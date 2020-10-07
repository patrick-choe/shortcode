# Golf Coding

<p align="center">
    <span>English</span> |
    <a href="README.md">한국어</a>
</p>

Golf Coding (Korean: `숏코딩`) is literally **Coding to make code as short as possible** while making code the same function.

Golf Coding can shorten the code, but reduce readability and speed;

I'll show you an example of Golf Coding;

Original (Python 154 characters);
```python
sans = []

def wasans():
    return "wasans"

for i in range(5000):
    sans.append(wasans)

result_func = sans[1234]
result = result_func()
print(result)
```

after golf coding (Python 39 characters);
```python
print(([lambda:'wasans']*5000)[1234]())
```

But why do they do Golf Coding when they say it's not readable?

## Golf Coding Rules

## Project
You can participate in Golf Coding with `Pull Request` and request additional Golf Coding projects through `Issues`;

the code must not violate the above rules;
