# exampol strakchur
#       0
#      000
#     00000
#    0000000
#   000000000
#  00000000000
# 0000000000000

pyramid = 7

for i in range(0, pyramid):
	for j in range(0, pyramid - i):
		print(" ", end = "")
	for k in range(0, 2 * i + 1):
		print("0", end = "")
	print("")