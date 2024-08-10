def get_max_value(df, column):
    return df[column].max()


def get_value_difference(df, column):
    difference = get_max_value(df, column) - min_speed(df, column)
    return difference
