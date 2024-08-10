import pandas as pd
from max_min_difference import get_max_value, min_speed, get_value_difference
from percentage import percentage_of_type
from dataframe_operations import check_len
from csv_reader import read_csv
from filtering import filter_greater_than_or_equal
from visualization import create_barh_chart


df = read_csv(file_path)

num_pokemons = check_len(df)
print(f"Number of Pokémon: {num_pokemons}")

speed_threshold = 80
filtered_df = filter_greater_than_or_equal(df, 'Speed', speed_threshold)
print(f"Number of Pokémon with Speed >= {speed_threshold}: {check_len(filtered_df)}")

max_speed = get_max_value(filtered_df, 'Speed')
min_speed = min_speed(filtered_df, 'Speed')
speed_difference = get_value_difference(filtered_df, 'Speed')

print(f"Max Speed: {max_speed}")
print(f"Min Speed: {min_speed}")
print(f"Speed Difference: {speed_difference}")



create_barh_chart(filtered_df, x_column='Name', y_column='Speed', df_title='Speed of Pokémon')
