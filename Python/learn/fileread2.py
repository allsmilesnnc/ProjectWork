# Write a program that prompts for a file name, then opens that file and reads through the file, looking for lines of 
# the form: X-DSPAM-Confidence:    0.8475
# Count these lines and extract the floating point values from each of the 
# lines and compute the average of those values and produce an output as 
# shown below.
# You can download the sample data at http://www.pythonlearn.com/code/mbox-short.txt 
# when you are testing below enter mbox-short.txt as the file name.

# Use the file name mbox-short.txt as the file name
fname = raw_input("Enter file name: ")
if len(fname) == 0:
    fname = "mbox-short.txt"

try:
    fh = open(fname)
except:
    print "File cannot be opened:",fname
    exit()

count = 0  
total = 0  
for line in fh:
    if not line.startswith("X-DSPAM-Confidence:") : continue
    # print line
    count = count + 1
    
    atpos = line.find('0')
    # print atpos
    sppos = atpos+6  # this is not good programming, need to look for /n"
    # print sppos
    number = line[atpos:] # to solve the problem from above, I just looked to the end
    # print number
    floatnumber = float(number)
    total = floatnumber + total
    # print floatnumber
    
# print "Done"
# print count
# print total
averagenumber = total / count
print "Average spam confidence:",averagenumber


