# Wardrobe
Practice for PA

Your task is to model a wardrobe. 
Clothes can be hanged into the wardrobe. 
A piece of clothing can only be hanged in the wardrobe if it’s on a hanger already – you can’t hang a shirt directly into the wardrobe. 

There are two types of hangers: 
- one that can accommodate a single shirt or blouse only, and 
- one that can accommodate a shirt or a blouse and at the same time trousers or a skirt too.

The requirements that you need to take care of are as follows:

- The wardrobe can accommodate only a certain number of hangers (the actual limit can vary between different wardrobes).
- When placing a single hanger into the wardrobe make sure that you don’t allow more than physically possible.
- Hangers can be put into the wardrobe either empty or with some clothes on them.
- All clothes must have a unique identifier, a brand name, and each one must have a type, which is different for different kinds of clothing: shirt, or blouse, trousers or skirt, etc.
- Different kinds of hangers (one that can accomodate shirts or blouses, and ones that can trousers or skirts too) 
  allow pieces of clothing on them to be taken off individually or all of them at once. 
  Also, they allow pieces of clothing to be put onto them one-by-one.
- Clothes can be taken out of the wardrobe by their unique identifier.
- Users of the wardrobe can test whether there’s still place in there for a particular type of clothing.

Hints: you should have an abstract class, use inheritance, data hiding and make sure there is no code repetition.
