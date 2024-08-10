import matplotlib.pyplot as plt
# import pandas as pd  # only needed to test the code, not needed for the method to work

# I intentionally made this method like this so that it would be able to build
# all kinds of horizontal bar charts and not only with the Pokemon dataset or the specific column names
def create_barh_chart(dataframe, x_column, y_column, df_title):
    dataframe.plot.barh(x=x_column, y=y_column)
    plt.title(df_title)
    plt.show()


# This is how I tested my method without seeing others' work. I received a functional chart.
# df = pd.read_csv("Pokemon.csv")
# x_col = "Name"
# y_col = "Speed"
# title = "Pokemons and their Speed"
# create_barh_chart(df, x_col, y_col, title)
