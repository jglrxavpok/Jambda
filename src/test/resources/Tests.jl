package jambda.tests
import whatevs

identity:: Natural -> Natural:
    lambda x.x

other_function:
    λx.(lambda x.45+(lambda a.a*2.5f))
