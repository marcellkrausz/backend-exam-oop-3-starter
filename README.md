### ShapeList

Egy `ShapeList`-et fogsz létrehozni, amiben különböző
típusú `Shape`-eket lehet tárolni

#### Shape

- Van egy `area` field-je, amely az alakzat területe

- Van egy getter-e az `area`-ra

- Van egy `speak` metódusa. Az, hogy hogy működik,
az alakzat típusától függ

##### Rectangle

- Van egy `int sideA` field-je, amely a téglalap egyik oldalának hossza

- Van egy `int sideB` field-je, amely a téglalap másik oldalának hossza

- Létrehozásánál meg kell kapnia a `sideA`-t és a `sideB`-t

  - Van egy `speak` metódusa, amely “I'm a rectangle”-t return-öl

##### Square
- Minden négyzet egy `Rectangle` is

- Van egy `int side` field-je, amely a négyzet egyik oldalának hossza

- Létrehozásánál meg kell kapnia a `side`-ot

  - Van egy `speak` metódusa, amely “I'm a square”-t return-öl

##### Triangle

- Van egy `int base` field-je, amely a háromszög egyik oldala

- Van egy `int baseHeight` field-je, amely a háromszög oldalához tartozó magasság

- Létrehozásánál meg kell kapnia a `base`-t és a `baseHeight`-et

  - Van egy `speak` metódusa, amely “I'm a triangle”-t return-öl

#### ShapeList

- Van egy `Shape` listája

- Van egy `add` metódusa, amely kap egy `Shape`-t paraméterként
  és hozzáadja a listához

- Van egy `getLargest` metódusa, amely
  return-öli a legnagyobb területtel rendelkező `Shape`-t a listában

  - Ha több alakzat rendelkezik a legnagyobb területtel, return-öld a listában legelőbbre megtalálhatót

- Van egy `compareArea` metódusa, amely kap két `Shape`-t paraméterként
  és összehasonlítja a területüket

  - A nagyobb területű `Shape` nyer
  - Ha a két `Shape` területe megegyezik, return-öld ezt: "Equal areas"
  - Ha a két `Shape` területe eltérő, return-öld a nyertes `speak` metódusát,
  hogy megtudd, melyiknek nagyobb a területe
