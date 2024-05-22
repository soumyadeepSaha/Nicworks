# Convert tuple->list
tuple = (1, 2, 3)

newlist = list(tuple)
print(newlist)



# list -> tuple
def conv(list):
    return tuple(list)

list = [1, 2, 3, 4]
print(conv(list))

