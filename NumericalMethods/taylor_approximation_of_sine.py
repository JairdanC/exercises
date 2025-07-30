import numpy as np
import matplotlib.pyplot as plt
x = np.pi/2 #Start point
trueSine = np.sin(np.linspace(start=-np.pi/2, stop=np.pi*(3/2), num=60))
constant = np.sin(np.ones(50)*x)
#linear = 
#quadratic =
#10th order =
plt.plot(trueSine)
plt.plot(constant)
plt.show()

#Ended here got lost in np functions
