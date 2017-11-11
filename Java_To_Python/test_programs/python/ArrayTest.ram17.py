class Tester():

    def foo(self):
        array = [1]    
        array.append(1)    
        print(array[0], end='')    
        return 0

if __name__ == '__main__':
    print(Tester().foo(), end='')

