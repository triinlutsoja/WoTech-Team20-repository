def check_name(dataframe, column):
    length_id = dataframe[column].str.strip(' ').str.len().idxmax()
    longest_name = dataframe.iloc[length_id][column]
    return longest_name
