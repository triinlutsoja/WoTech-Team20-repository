from read_data import read_csv
from pokemon_water_type import pokemon_water_percentage
from pokemon_speed_value import min_speed
from speed_value import max_speed, difference
from filter_data import filter_greater_than_or_equal
from dataframe_length import check_len
from longest_name import check_name
from visualize_data import create_barh_chart

# Define the path to the CSV file
file_path = 'Pokemon.csv'

# Read the CSV file
dataframe = read_csv(file_path)

# Calculate the percentage of Water-type Pokémon
water_percentage = pokemon_water_percentage(dataframe)

# Calculate the minimum speed
min_speed_value = min_speed(dataframe)

# Calculate the maximum speed
max_speed_value = max_speed(dataframe)

# Calculate the difference between max and min speed
speed_difference = difference(dataframe)

# Filter Pokémon by speed threshold and print the number of filtered Pokémon
speed_threshold = 80
filtered_data = filter_greater_than_or_equal(data, 'Speed', speed_threshold)

# Get the length of the DataFrame
data_length = check_len(dataframe)

# Find the longest Pokémon name
longest_pokemon_name = check_name(dataframe, 'Name')

# Create a horizontal bar chart of Pokémon speeds
create_barh_chart(dataframe, x_column='Name', y_column='Speed', df_title='Speed of Pokémon')
