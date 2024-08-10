def get_max_speed(df, Speed):
    max_speed = get_max_speed(df, 'Speed')
    return df[column].max()

def get_min_speed(df, Speed):
    min_speed = get_min_speed(df, 'Speed')
    return df[Speed].min()


def get_speed_difference(df, Speed):
 max_value = df[Speed].max()
 min_value = df[Speed].min()
 difference = max_value - min_value
 return difference
