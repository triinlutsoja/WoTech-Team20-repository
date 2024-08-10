import pandas as pd
from max_min_difference import get_max_value, get_min_value, get_value_difference
from percentage import percentage_of_type
from dataframe_operations import check_len
from csv_reader import read_csv
from filtering import filter_greater_than_or_equal
from visualization import create_barh_chart

df = read_csv(file_path)

num_pokemons = check_len(df)

speed_threshold = 80
filtered_df = filter_greater_than_or_equal(df, 'Speed', speed_threshold)

max_speed = get_max_value(filtered_df, 'Speed')
min_speed = get_min_value(filtered_df, 'Speed')
speed_difference = get_value_difference(filtered_df, 'Speed')

water_percentage = percentage_of_type(df, 'Type 1', 'Water')

create_barh_chart(filtered_df, x_column='Name', y_column='Speed', df_title='Speed of Pokémon')
