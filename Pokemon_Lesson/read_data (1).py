def get_max_value(df, column):
    return df[column].max()

def get_min_value(df, column):
    return df[column].min()

def get_value_difference(df, column):
    max_value = get_max_value(df, column)
    min_value = get_min_value(df, column)
    difference = max_value - min_value
    return difference
