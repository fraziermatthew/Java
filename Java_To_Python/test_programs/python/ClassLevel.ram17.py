class A():
    c = 0
    d = 0

    def helper(self, a):
        global c
        global d
        c = 5    
        b = 4 * c    
        d = 1    
        return b - d

if __name__ == '__main__':
    print(A().helper(4))

