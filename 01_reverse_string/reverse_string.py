word = input()
#print(word[::-1])

reverse = ""
for i in word:
    reverse = i + reverse

print(reverse)