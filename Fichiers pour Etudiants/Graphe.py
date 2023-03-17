class Sommet:
    def __init__(self, name, type) -> None:    
        self.name = name
        self.type = type
        self.voisin = []

    def addVoisin(self, voisin):
        pass

class Arrete:
    def __init__(self, name, sommets, risque, distance, temps) -> None:
        self.name = name
        self.sommets = sommets
        self.risque = risque
        self.distance = distance
        self.temps = temps



# Noeud[] var = {};

s1 = Sommet("s1", 1, [])
s2 = Sommet("s2", 2, [])

a1 = Arrete("a1", (s1, s2), 4, )