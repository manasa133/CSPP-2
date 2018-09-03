class Student(object):
	name="hello"
	rollnum=""
	# def __init__(self,name1):
	# 	self.name = name1

	def avgMarks(self,marks):
		print(self.name)
		return sum(marks)/len(marks)


obj = Student("bcd")
print(obj.name)
# obj.name = "hai"
# obj.avgMarks([1,2,3,5])