# Write code using find() and string slicing to extract the number at
# the end of the line below.  Convert the extracted value to a floating
# point number and print it out

text = "X-DSPM-Confidence:     0.8475";
atpos = text.find('0')
# print atpos
sppos = text.find('5',atpos)
# print sppos
number = text[atpos:sppos+1]
# print number
floatnumber = float(number)
print floatnumber