x = 5
if x < 10:
	print 'Smaller'
print 'Done with 2'

if x > 20:
	print 'Bigger'
	
for i in range(5):
    print i
    if i > 2:
        print 'Bigger than 2'
    print 'Done with i',i
    
# this is an example of Nested Decisions

x = 42

if x > 1:
    print 'More than one'
    if x < 100:
       print 'Less than 100'

print 'All done'
#print int("0xb5ff295960ba7cddc1e952d755f5f2faec777223ca69c759973773c79eb7ce722dad28aed6fb6523274d7f8050eefa92d88494d80d611f27c7638da0ff774bb52bfc0deb64570d07a1a788e0db8e4c1e27e2fb1f940d284b68687a14b1266b08dd2c91128c25c182ac41e3c676be0a8f3cd0086f4db5a3f51898441d06515129", 0)
e = int("0x10001", 0)
d = int("0xbc343e4eca822c4117f25fec64e248be87561747a67f2a99c29a9d0a91221429955233338c6bc383c42b17fbf7f0f82f78623b269e18fe0f0d91671511bc8f08dd9c8c7718993c63de5a21d5b9a74f0ee8fb202dfd9ee3de22bf904fc10fe5f9c9352557e5a7263f98a29dcdca87297a00ca2a5f870a9741fcb0508bac3b3f81", 0)
N = int("0xbf2eb8aad16b5e900a1bbe6970ec9c5fde0d5bd7ad1c8ee23a95cc7ffc1d297cf76580f389f90c3c47dd31782ab721cb15bc4dcedd7a0e79b89c023f6d8a12ea80ba540f6a877b60351084a73080bd565bc04f301b76833b1022f40b465d047c23f319dbfbaec3435795b2b8bd77c90dbb69fefeaba9f01eea1581f8cfdcc2db", 0)

c = int("0xb5ff295960ba7cddc1e952d755f5f2faec777223ca69c759973773c79eb7ce722dad28aed6fb6523274d7f8050eefa92d88494d80d611f27c7638da0ff774bb52bfc0deb64570d07a1a788e0db8e4c1e27e2fb1f940d284b68687a14b1266b08dd2c91128c25c182ac41e3c676be0a8f3cd0086f4db5a3f51898441d06515129", 0)
phi = 961756050*961760112
print c 
file = open("newfile.txt", "w")

file.write(str(N))

file.write("and another line")

file.write(str(e))
file.write("and another line")
file.write(str(d))
file.write("and another line")
file.write(str(c))
file.write("and another line")
t = pow(c,d,N)
print (t)

hex(t)
print(hex(t))
file.write(str(t))
file.close()