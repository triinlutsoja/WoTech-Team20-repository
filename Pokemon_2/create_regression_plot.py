import seaborn as sns
import matplotlib.pyplot as plt

def create_reg_plot(dataframe, column1, column2, plot_title, xlabel, ylabel):
    sns.regplot(x=column1, y=column2, data=dataframe)
    plt.title(plot_title)
    plt.xlabel(xlabel)
    plt.ylabel(ylabel)
    plt.show()
