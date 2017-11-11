class WhileStuff():

    def method(self, a, b, c, d, e, f):
        count = f    
        while count < 20:
            print(count)        
            count = count + 1            
        return e

if __name__ == '__main__':
    print(WhileStuff().method(3, 4, 5, 6, 7, 8))

