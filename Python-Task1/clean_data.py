def process_data(dataframe):
    clean_data = dataframe['Gender'].value_counts(dropna=False)
    return clean_data
