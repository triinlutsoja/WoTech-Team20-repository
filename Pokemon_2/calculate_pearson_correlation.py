def calculate_pearson_correlation(dataframe, column1, column2):
  correlation = dataframe[column1].corr(dataframe[column2])
  return correlation
