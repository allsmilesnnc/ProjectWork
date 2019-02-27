import re

from datetime import datetime
hand = open('July2015AccessNERS.txt')
SEBROADBANDcount = 0
NERS1count = 0
NERS2count = 0
NERS3count = 0
SouthEcount = 0
EMUXcount = 0
SENER1NOTBBcount = 0
atposnumbertwo =''
durations = list()
for line in hand:
    line = line.rstrip()
    words = line.split()
    #print line
    WEST = line[20]
    #PLANNEDACTIVITY = re.search('Y',line)
    #if WEST == 'W':
    #    PLANNEDACTIVITY = line[98]
    #else:
    #    PLANNEDACTIVITY = line[99]
    #print WEST
    if re.search(' N ',line):
        #print PLANNEDACTIVITY
        if line.endswith('n'): 
            #print words
            #if words = 'y' : continue
            #if re.search('y',words): continue
            if re.search('NER1',line):
                NERS1 = line
                NERS1count = NERS1count + 1
                #print NERS1
            if re.search('NER2',line):
                NERS2 = line
                NERS2count = NERS2count + 1
                #print NERS2
            if re.search('NER3',line):
                NERS3 = line
                NERS3count = NERS3count + 1
                #print NERS3
            if re.search('Access EMUX',line):
                EMUX = line
                EMUXcount = EMUXcount + 1
                #print EMUX
            if re.search('GE1',line):
                EMUX2 = line
                EMUXcount = EMUXcount + 1
                print EMUX2
            if re.search(' SE ',line):
                SouthE = line
                #print SouthE
                if re.search('NER1',SouthE) and not re.search('Broadband ',SouthE):
                    SENER1NOTBB = SouthE
                    SENER1NOTBBcount = SENER1NOTBBcount + 1
                    #print SENER1NOTBB
                if re.search('Broadband ',SouthE):
                    SEBROADBAND = SouthE
                    SEBROADBANDcount = SEBROADBANDcount + 1
                    #print SEBROADBAND
                    #y = re.findall('^2015)
            
                    #text = "X-DSPM-Confidence:     0.8475";
                    atposnumber = SEBROADBAND[90:98]
                    atposnumbertwo = atposnumber + atposnumbertwo
                    #import datetime as dt
                    #FMT = '%H:%M:%S'
                    #time = dt.datetime.strptime(atposnumber, FMT)
                    #print time
                    #atposnumbertwo = float(atposnumber)
                    durations.append(atposnumber)
                    #print atposnumber
                    #durationnumber = SEBROADBAND.find[93:8]
                    #print durationnumber
                    # sppos = text.find('5',atpos)
                    # print sppos
                    # number = text[atpos:sppos+1]
                    # print number
                    # floatnumber = float(number)
                    # print floatnumber
            
            
        #for y in line:
           # y = re.search('NER1',line)
#x = 'My 2 favorite numbers are 19 and 42'
         #y = re.findall('NERS1([8]+)',line)
#print y
         #y = re.findall('^15',line)
#print y
# ('@([^ ]*)')  Match non-blank character   Match many of them  or you can use the + which might be better
print 'The count for the Southeast BroadBand NERS tickets is',SEBROADBANDcount
print 'The count for all NERS1 is',NERS1count
print 'The count for all NERS2 is',NERS2count
print 'The count for all NERS3 is',NERS3count
print 'The count for all EMUX is',EMUXcount
print 'The count for all Southeast NERS1 that are not BroadBand is',SENER1NOTBBcount
#print durations
#print atposnumbertwo
#from datetime import timedelta
#print(str(timedelta(seconds=sum(map(lambda f: int(f[0])*3600 + int(f[1])*60 + int(f[2]), map(lambda f: f.split(':'), durations)))/len(durations))))
#time_list = map(lambda s: int(s[6:8]) + 60*(int(s[3:5]) + 60*int(s[0:2])), durations)