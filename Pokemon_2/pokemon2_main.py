from read_dataframe import read_csv
from filter_dataframe import filter_dataframe
from create_regression_plot import create_reg_plot
from calculate_pearson_correlation import calculate_pearson_correlation
from description_pokemon(1) import correlation_comparison
from description_pokemon(1) import correlation_individual



# Define the path to the CSV file
file_path = 'Pokemon.csv'

# Read the CSV file
dataframe = read_csv(file_path)

#Filter the dataframe by type
Grass_df = filter_dataframe(dataframe, 'Type 1', 'Grass')
Water_df = filter_dataframe(dataframe, 'Type 1', 'Water')

#Create 2 regression plots ()

Grass_rp = create_reg_plot(Grass_df, 'Sp. Atk', 'Sp. Def','Attack and Defence for Grass type pokemons', 'Attack', 'Defence')
Water_rp = create_reg_plot(Water_df, 'Sp. Atk', 'Sp. Def','Attack and Defence for Water type pokemons', 'Attack', 'Defence')

#Calculate Pearson coefficient
Grass_pc = calculate_pearson_correlation(Grass_df, 'Attack', 'Defence')
Water_pc = calculate_pearson_correlation(Water_df, 'Attack', 'Defence')

#Description of the results
correlation_comparison('Grass', Grass_pc, 'Water', Water_pc, 'Attack', 'Defence')

#Description of Grass
print('Grass type pokemons:')
correlation_individual(Grass_pc, 'Attack', 'Defence')

#Description of Water
print('Water type pokemons:')
correlation_individual(Water_pc, 'Attack', 'Defence')