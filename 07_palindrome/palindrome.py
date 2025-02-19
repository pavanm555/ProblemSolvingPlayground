
word = "malayala"
# rev = ""

# for i in range(len(word)):
#     rev = word[i] + rev

# print(rev)

# if word == rev:
#     print("Palindrome")
# else:
#     print("Not a Palindrome")


for i in range(len(word)//2):
    if word[i] != word[-i-1]:
        print("Not a Palindrome")
        break
else:
    print("Palindrome")