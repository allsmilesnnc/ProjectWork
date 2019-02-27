# Write a program that prompts for a file name, then opens that file 
# and reads through the file, and print the contents of the file in upper case. 
# Use the file words.txt to produce the output below.

# Use words.txt as the file name
fname = raw_input("Enter file name: ")
try:
    fh = open(fname)
except:
    print "File cannot be opened:",fname
    exit()

# count the number of characters in the file
# inp = fh.read()
# print len(inp)


# count the number of line in the file
count = 0
for line in fh:
    count = count + 1
    line = line.rstrip()
    print line.upper()
# print "Line Count:", count

# count the number of characters in the file
# inp = fh.read()
# print len(inp)
