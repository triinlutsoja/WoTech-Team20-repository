def max_speed(df):
    max_speed= df['Speed'].max()
    return max_speed


def difference(df):
    difference = max_speed(df) - df['Speed'].min()
    return difference


