# -*- coding: utf-8 -*-
"""Copy of Gender.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/1T0LBUFgap1taLy0fVPTyb_m1HLvCF5D5
"""

import matplotlib.pyplot as plt

plt.bar(gender_counts.index.astype(str), gender_counts.values, color='yellow')
plt.title('Gender Distribution (Including NaN)')
plt.xlabel('Gender')
plt.ylabel('Count')
plt.xticks(rotation=45, ha='right')

plt.show()