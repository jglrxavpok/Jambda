package jambda.tests
import whatevs

identity:: Natural -> Natural:
    lambda x.x

nested_functions:
    λx.(lambda x.45+(lambda a.a*2.5f))
