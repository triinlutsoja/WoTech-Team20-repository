def get_max_speed(df, column='Speed'):
    return df[column].max()

def get_min_speed(df, column='Speed'): 
    return df[column].min()

def get_speed_difference(df, column='Speed'): 
    max_value = get_max_speed(df, column)  
    min_value = get_min_speed(df, column) 
    difference = max_value - min_value
    return difference
