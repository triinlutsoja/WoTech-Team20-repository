def filter_dataframe(dataframe, column_name, value):
  filtered_df = dataframe[dataframe[column_name] == value]
  return filtered_df
