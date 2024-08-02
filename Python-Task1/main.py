from read_data import read_csv
from clean_data import process_data
from chart import create_barchart  # I don't know what Liisa will name her file or method, yet.

# Define the path to the CSV file
file_path = 'transaction_dataset.csv'

# Read the CSV file by calling the method inside read_data.py
data = read_csv(file_path)

# Process the data by calling the method inside clean_data.py
clean_data = process_data(data)

# Print the bar chart by calling the method inside chart.py
create_barchart(clean_data)