name = raw_input("Enter file:")
if len(name) < 1 : name = "mbox-short.txt"
handle = open(name)
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