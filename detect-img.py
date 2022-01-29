import imageio
import numpy as np

f = imageio.imread(filename, as_gray=True)

def img_estim(img, thrshld):
    is_light = np.mean(img) > thrshld
    return 'light' if is_light else 'dark'

print(img_estim(f, 127))
