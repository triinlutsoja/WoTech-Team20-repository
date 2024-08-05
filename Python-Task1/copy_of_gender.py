import matplotlib.pyplot as plt

def create_barchart(whatever_dataframe):
    plt.bar(whatever_dataframe.index.astype(str), whatever_dataframe.values, color='yellow')
    plt.title('Gender Distribution (Including NaN)')
    plt.xlabel('Gender')
    plt.ylabel('Count')
    plt.xticks(rotation=45, ha='right')

    plt.show()
