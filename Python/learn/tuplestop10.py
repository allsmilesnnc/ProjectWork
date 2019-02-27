fhand = open('romeo.txt')
counts = dict()
for line in fhand:
    words = line.split()
    for word in words:
        wrd = word.lower()
        counts[wrd] = counts.get(wrd, 0 ) + 1

#print counts.items()

flipped = list()
for kie, vaal in counts.items() :
    #print kie, vaal
    newtup = (vaal, kie)
    #print newtup
    flipped.append(newtup)
    
#print flipped
flipped.sort(reverse=True)
#print flipped[:5]

for kay, vall in flipped[:5]:
    print "Winner", kay, vall
    