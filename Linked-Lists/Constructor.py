class Node:
    def __init__(self,value):
        self.value = value
        self.next = None

class LinkedList:
    def __init__(self,value):
        new_node = Node(value)
        self.head = new_node
        self.tail = new_node
        self.length = 1
        
    def print_list(self):
        temp = self.head
        while temp.next is not None:
            print(temp.value)
            temp = temp.next
            
    def append(self,value):
        new_node = Node(value)
        if self.length == 0: #or you can say self.head is None
            self.head = new_node
            self.tail = new_node
        else:
            self.tail.next = new_node
            self.tail = new_node
        self.length += 1
        
    def pop(self):
        if self.head is None: # or self.length == 0
            return None
        temp = self.head
        pre = self.head
        while(temp.next):
            pre = temp
            temp = temp.next
        self.tail = pre
        self.tail.next = None
        self.length -= 1
        if self.length == 0:
            self.head = None
            self.tail = None
        return temp
    
    def prepend(self,value):
        new_node = Node(value)
        if self.head == None:
            self.head = new_node
            self.tail = new_node
        else:
            new_node.next = self.head
            self.head = new_node
        self.length += 1
        return True
    
    def pop_first(self):
        if self.head == None:
            return None
        else:
            temp = self.head
            self.head = temp.next
            temp.next == None
        self.length -= 1
        if self.length == 0:
            self.tail = None
        return temp
    
    def get(self,index):
        if index < 0 or index >= self.length:
            return None
        temp = self.head
        for x in range(index):
            temp = temp.next
        return temp
    
    def set_value(self, index,value):
        if index < 0 or index >= self.length:
            return False
        new_node = Node(value)
        temp = self.get(index)
        temp.value = value
        return True
    
    def insert(self, index, value):
        if index < 0 or index > self.length:
            return False
        elif index == 0:
            return self.prepend(value)
        elif index == self.length:
            return self.append(value)
        else:
            new_node = Node(value)
            pre = self.get(index - 1)
            temp = pre.next
            pre.next = new_node
            new_node.next = temp
        self.length += 1
        return True
    
    def remove(self,index):
        if index < 0 or index >= self.length:
            return None
        if index == 0:
            return self.pop_first()
        elif index == self.length - 1:
            return self.pop()
        else:
            pre = self.get(index - 1)
            temp = pre.next
            pre.next = temp.next
            temp.next = None
        self.length -= 1
        return temp
        
            

my_linked_list = LinkedList(4)
my_linked_list.append(3)
my_linked_list.append(9)
my_linked_list.append(7)

print(my_linked_list.print_list())