# -*- coding: utf-8 -*-
"""read_data

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/1wAeuT31zi5DmhJnXGF50ut8h2PGLf4q0
"""

import pandas as pd

def read_csv(file_path):
    data = pd.read_csv(file_path)
    return data