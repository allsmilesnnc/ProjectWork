name = raw_input("Enter file:")
if len(name) < 1 : name = "mbox-short.txt"
handle = open(name)
#text = handle.read()
#print len(text),text[:40]
#words = text.split()

dic = {}
maxvalue = 0
name = ""
line = [text.split()[1] for text in handle.readlines() 
            if text.startswith("From") and text.find("@")>0 and len(text.split()) > 2]
for text in line:
    if not dic.has_key(text):
        dic[text] = 1
    else:
        dic[text] +=1
        if maxvalue < dic[text]:
            maxvalue = dic[text]
            name = text

print name,maxvalue

# Write a program to read through the mbox-short.txt and figure out who has
# sent the greatest number of email messages.  The program looks for 'From '
# lines and takes the second word of those lines as the person who sent the email.
# The program creates a Python dictionary that maps the sender's mail address
# to a count of the number of times they appear in the file.  After the dictionary
# is produced, the program read through the dictionary using a maximum
# loop to find the most prolific committer.

# the Desired Output should be "cwen@iupui.edu 5"

#counts = dict()

# print 'Words:',words

#print 'Counting...'

#for word in words :
#    counts[word] = counts.get(word,0)+1
#print 'Counts',counts


    
#bigcount = None
#bigword = None
#for word,count in counts.items():
#    if bigcount == None or count > bigcount:
#        bigword = word
#        bigcount = count

#print bigword,bigcount
#print len(text),text[:40]
#print len(words)
#print words

#cou = dict()
#for wrd in words:
#    if wrd in cou:
#        cou[wrd] = cou[wrd] + 1
#        print wrd, "Word Up!", cou[wrd]
        
#    else:
#        cou[wrd] = 1
#        print "Word", cou[wrd]
        
#    print wrd, cou[wrd]
#print cou
#count = 0
#for line in handle:
#    if not line.startswith("FROM ") : continue
#    print line
#    count = count + 1



#for wrd in words:
#    cou[wrd] = cou.get(wrd,0) + 1

#maxval = None
#maxkee = None
#for kee,val in cou.items() :
#    if maxval == None : maxval = val
#    if maxval <= val :
#        maxval = val
#        maxkee = kee
#    print kee, val, maxkee, maxval
#    print wrd
#print maxkee, maxval
# another way to write the 2 if statements above is:
# if maxval == None or maxval < val :