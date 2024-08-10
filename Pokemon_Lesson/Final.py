import pandas as pd
from max_min_difference import get_max_value, get_min_value, get_value_difference
from dataframe_operations import check_len
from csv_reader import read_csv
from filtering import filter_greater_than_or_equal
from visualization import create_barh_chart

def percentage_of_type(df: pd.DataFrame, column: str, type_value: str) -> float:
    return (df[df[column] == type_value].shape[0] / len(df)) * 100

file_path = 'path_to_your_pokemon_data.csv' 

df = read_csv(file_path)

num_pokemons = check_len(df)
print(f"Number of Pokémon: {num_pokemons}")

speed_threshold = 80
filtered_df = filter_greater_than_or_equal(df, 'Speed', speed_threshold)
print(f"Number of Pokémon with Speed >= {speed_threshold}: {check_len(filtered_df)}")

max_speed = get_max_value(filtered_df, 'Speed')
min_speed = get_min_value(filtered_df, 'Speed')
speed_difference = get_value_difference(filtered_df, 'Speed')

print(f"Max Speed: {max_speed}")
print(f"Min Speed: {min_speed}")
print(f"Speed Difference: {speed_difference}")

water_percentage = percentage_of_type(df, 'Type 1', 'Water')
print(f"Percentage of Water-type Pokémon: {water_percentage:.2f}%")

create_barh_chart(filtered_df, x_column='Name', y_column='Speed', df_title='Speed of Pokémon')
