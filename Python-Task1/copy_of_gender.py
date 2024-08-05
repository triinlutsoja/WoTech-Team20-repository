import matplotlib.pyplot as plt

plt.bar(gender_counts.index.astype(str), gender_counts.values, color='yellow')
plt.title('Gender Distribution (Including NaN)')
plt.xlabel('Gender')
plt.ylabel('Count')
plt.xticks(rotation=45, ha='right')

plt.show()
