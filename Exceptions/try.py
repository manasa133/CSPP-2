# try:
# 	a=1/0
# except:
# 	print("exception")
# print("hello")
def avg(marks):
    assert len(marks) != 0
    return sum(marks)/len(marks)

mark1 = []
print("Average of mark1:",avg(mark1))

