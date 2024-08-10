def get_max_speed(df, Speed):
    return df[column].max()
    max_speed = get_max_speed(df, 'Speed')

def get_min_speed(df, Speed):
    return df[Speed].min()
    min_speed = get_min_speed(df, 'Speed')


def get_speed_difference(df, Speed):
 max_value = df[Speed].max()
 min_value = df[Speed].min()
 difference = max_value - min_value
 return difference
