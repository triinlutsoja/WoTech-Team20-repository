import pandas as pd

def read_csv(file_path):
    data = pd.read_csv(file_path)
    return data
