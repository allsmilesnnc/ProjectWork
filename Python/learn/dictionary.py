counts = dict()
names = ['scott','steve','jessica','scott','jessica','todd']
for name in names :
    counts[name] = counts.get(name,0)+1
print counts
