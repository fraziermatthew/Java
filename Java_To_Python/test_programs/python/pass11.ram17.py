class ImAClass():
    x = 0

    def runForLoop(self):
        global x
        x = 0
        while x < 10:
            print(x)        
            x = x + 1            
        return x

if __name__ == '__main__':
    ImAClass = ImAClass().runForLoop()

