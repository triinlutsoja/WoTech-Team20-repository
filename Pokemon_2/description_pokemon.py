def correlation_comparison(string_a, float_a, string_b, float_b, value_a, value_b):
  if float_a > 0 and float_b > 0:
    print(f'Both {string_a} and {string_b} show positive correlation between {value_a} and {value_b}')
  elif (float_a == 0 and float_b > 0) or (float_a > 0 and float_b == 0):
    if float_a == 0:
      print (f'{string_a} has no correlation between {value_a} and {value_b}, however {string_b} has positive correlation between the same criteria')
    else:
      print (f'{string_b} has no correlation between {value_a} and {value_b}, however {string_a} has positive correlation between the same criteria')
  elif (float_a > 0 and float_b < 0) or (float_a < 0 and float_b > 0):
    if float_a > 0:
      print(f'There is positive correlation between {value_a} and {value_b} in {string_a}, but a negative one in {string_b}')
    else:
      print(f'There is positive correlation between {value_a} and {value_b} in {string_b}, but a negative one in {string_a}')
  elif float_a == 0 and float_b == 0:
    print(f'Neither {string_a} nor {string_b} have any correlation between {value_a} and {value_b}')
  elif (float_a == 0 and float_b < 0) or (float_a < 0 and float_b == 0):
    if float_a == 0:
      print (f'{string_a} has no correlation between {value_a} and {value_b}, however {string_b} has negative correlation between the same criteria')
    else:
      print (f'{string_b} has no correlation between {value_a} and {value_b}, however {string_a} has negative correlation between the same criteria')
  elif float_a < 0 and float_b < 0:
    print(f'Both {string_a} and {string_b} show negative correlation between {value_a} and {value_b}')

