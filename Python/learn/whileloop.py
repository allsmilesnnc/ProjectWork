largest = 0
smallest = 0
count = 0
total = 0
while True:
    inp = raw_input("Enter a number: ")
    
    # Handle the edge cases
    if inp == "done" : break
    if len(inp) < 1 : break # check for empty line
        
    # Do the work   
    try : 
        num = int(inp)
    except:
        print "Invalid input" 
        break
      # continue
    count = count + 1
    total = total + num
    if num > largest :
        largest = num
    else :
        smallest = num
    
    # print num, total, count

# print "average:", total / count
# print "count = ", count
# print "DONE"
print "Maximum is", largest
print "Minimum is", smallest
 
#largest = None
#smallest = None
#while True:
#    num = raw_input("Enter a number: ")
#    if num == "done" : break
#    print num

# print "Maximum", largest