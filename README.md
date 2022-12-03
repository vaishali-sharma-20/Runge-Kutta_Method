# Runge-Kutta_Method
Here, Code of  Runge Kutta Method of Computer Oriented Numerical Methods in Java Language. In numerical analysis, the Runge–Kutta methods are a family of implicit and explicit iterative methods, which include the Euler method, used in temporal discretization for the approximate solutions of simultaneous nonlinear equations
# Project title

Runge Kutta Method


## Motivation

A University Assignment. Clearly Used to Solve anhy Porblem and Perform Computer Oriented Prolblems .


## Method and results

1. Start

2. Define function f(x,y)

3. Read values of initial condition(x0 and y0), 
   number of steps (n) and calculation point (xn)
   
4. Calculate step size (h) = (xn - x0)/n

5. Set i=0

6. Loop 
      
      k1 = h * f(x0, y0)
      k2 = h * f(x0+h/2, y0+k1/2)
      k3 = h * f(x0+h/2, y0+k2/2)
      k4 = h * f(x0+h, y0+k3)
      
      k = (k1+2*k2+2*k3+k4)/6
      
      yn = y0 + k
      
      i = i + 1
      x0 = x0 + h
      y0 = yn
      
   While i < n

7. Display yn as result

8. Stop
## Repository overview

Provide an overview of the directory structure and files, for example:

├── README.md
├── out
├── Runge_Kutta.iml
├── .idea
│   ├── misc.xml
│   ├── modules.xml
|   ├── vcs.xml
│   └── workspace.xml
└── src
    ├── Runge_Kutta.java



## More resources

Referenced from Computer oriented Numerical Method Book By Rajaraman and our Faculty Dr. Shaligram Prajapat.


## About

You can say it has been part of a class you've taken at International Institute of Professional Studies, Indore.

