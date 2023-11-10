bscs = "The final exam in PROG 1"
s1 = bscs [4:14]
s2 = bscs [10:14] + "inee"
s3 = s1.capitalize() + "ination" + bscs [15:]
s4 = "good luck!"
xi = (s1, s4)
x = "**"
print(bscs[18:], s3[:17])

for i in range(1, 6):
    for j in range (1, i+1):
        print(i, end="")
    print()

dogs = ["KK", "Cyber", "Blake", "Pinky", "Taki", "Chubby"]
a = len(dogs)
b = dogs.index("Pinky")
c = dogs.index("Blake")

dogs.insert(b+2, "Tofu")
dogs.insert(c-1, "Oprah")
print(dogs)