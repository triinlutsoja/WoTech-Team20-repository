# Filter rows that have a specific value in a specific column.
# I assume the name of the column is given to this method by main.py
        # column = "Speed"
# I assume the threshold value is given to this method by main.py
        # threshold = 80

def filter_greater_than_or_equal(original_dataframe, column_of_interest, threshold):
    filtered_dataframe = original_dataframe[original_dataframe[column_of_interest] >= threshold]
    return filtered_dataframe