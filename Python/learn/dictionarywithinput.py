counts = dict()
print 'Enter a line of text:'

line = raw_input("")

words = line.split()
print 'Words:',words

print 'Counting...'
for word in words :
    counts[word] = counts.get(word,0)+1
print 'Counts',counts


name = raw_input("Enter file:")
handle = open(name,'r')
text = handle.read()
words = text.split()

counts = dict()
for words in words:
    counts[word] = counts.get(word,0)+1
    
bigcount = None
bigword = None
for word,count in counts.items():
    if bigcount is None or count > bigcount:
        bigword = word
        bigcount = count

print bigword,bigcount
