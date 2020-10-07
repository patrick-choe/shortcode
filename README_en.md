# Golf Coding;

<p align="center">
    <span>English</span> |
    <a href="README.md">한국어</a>
</p>

Golf Coding (Korean: `숏코딩`) is **Making the code as short as possible but making the code do to same thing**;

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

But why do they do Golf Coding when it's not good?;

[Cha Jung Woo once said](https://namu.wiki/w/GuguClass) ~~GuGuClass~~;

> Who made the code in ten lines when it could be a single line? It makes it harder to find errors. (Few minutes later) It makes the program heavier cause the code is long? That's why the service is slow.

Thats just nonesence but we are going to follow Cha Jung Woo by shortening the long code;

If you want to shorten the code with us, come to this Discord guild;

[Go](https://discord.gg/7dQTTcA);

## Golf Coding Rules;
You can write many codes on one line by using `;`

If `;` is not required, You doesn't have to use `;`

Newline is one letter. And space is also one letter;

Only one file is possible;

Only modules that are in the folder `ALLOWED_MODULES` could be used (Except for Built-in Modules) (Could be applied by ISSUES);

Only languages that are in the file `ALLOWED_LANGUAGE.txt` could be used (Could be applied by ISSUES);

When using languages like Python, you can use spaces insted of tabs;

## Project;
You can participate in Golf Coding with `Pull Request` and request additional Golf Coding projects through `Issues`;

the code must not violate the above rules;
