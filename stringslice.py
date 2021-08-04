s=input("enter a word\n")
d="".join(reversed(s))
if s==d:
    print("Palindrom String")
else:
    print("Not a palindrom String")