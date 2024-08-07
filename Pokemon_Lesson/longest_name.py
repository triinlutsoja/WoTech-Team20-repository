def check_name(dataframe):
    length = dataframe['Name'].str.strip(' ').str.len().idxmax()
    longest_name = dataframe.iloc[length]['Name']
    return longest_name