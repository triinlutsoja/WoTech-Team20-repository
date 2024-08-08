import pandas as pd

def read_csv(data):
    data = pd.read_csv('/content/Pokemon.csv')
    return data

def get_percentage_of_type(df, column, pokemon_type):
    total_pokemon = len(df)
    type_count = df[df[column] == pokemon_type].shape[0]
    percentage = (type_count / total_pokemon) * 100
    return percentage

water_percentage = get_percentage_of_type(df, 'Type 1', 'Water')
    print(f"Percentage of Water-type Pokémons: {water_percentage:.2f}%")

def read_csv(file_path):
    data = pd.read_csv('/content/Pokemon.csv')
    return data

def get_max_speed(df, Speed):
    return df[column].max()
    max_speed = get_max_speed(df, 'Speed')

print(f"The maximum Speed value is: {max_speed}")

def get_min_speed(df, Speed):
    return df[Speed].min()
    min_speed = get_min_speed(df, 'Speed')

print(f"The minimum Speed value is: {min_speed}")

def get_speed_difference(df, Speed):
 max_value = df[Speed].max()
 min_value = df[Speed].min()
 difference = max_value - min_value
 return difference

speed_difference = get_speed_difference(df, 'Speed')
print(f"The difference is: {speed_difference}")
