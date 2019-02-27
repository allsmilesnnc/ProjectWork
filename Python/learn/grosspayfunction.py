def computepay(h, r) :
    # print "In computepay h=", h, "r=", r
    if h <= 40 :
        p = r * h
    else :
        p = r * 40 + (r * 1.5 * (h - 40))
    # print "Finished with computepay", p
    return p


try: 
    inp = raw_input("Enter Hours: ")
    hours = float(inp)
    inp = raw_input("Enter Rate: ")
    rate = float(inp)
except:
    print "Error, please enter numeric input"
    quit()

# print "In the main code", rate, hours
pay = computepay(hours, rate)
print pay

def computepay(h,r):
    return 42.37

# hrs = raw_input("Enter Hours:")
# p = computepay(10,20)
# print "Pay",p