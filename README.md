#Refactorització del codi Java

Aquest README detalla la refactorització del codi Java original proporcionat.

Canvis realitzats:
Extracció de mètodes: s'han extret diversos blocs de codi del mètode main() en mètodes separats per millorar la llegibilitat i la reutilització del codi. Aquests inclouen compareNumbers(), solveQuadraticEquation() i calculateTotalOrderPrice().

Extracció de classes: extreu diverses classes del codi original per millorar l'organització del codi i la separació de tasques. Aquestes classes són Menu, Utils, Address, Person, Customer, Order i OrderLineItem.

Mètodes i variables reanomenades: es van canviar el nom de diversos mètodes i variables per millorar la claredat del codi. Per exemple, el mètode getFullAddress() s'ha canviat a getFullAddress().

Desduplicació de codi: elimina la duplicació de codi eliminant mètodes i creant classes reutilitzables.

Substitució d'algoritmes: substitueix un algorisme que compara dos nombres per un mètode més senzill i eficient.

Organització de les classes en paquets: Les classes s'organitzen en paquets segons la seva funcionalitat per millorar l'organització del codi.

En conclusió
La refactorització permet millorar significativament la qualitat del codi, augmentant la llegibilitat, la reutilització i el manteniment del codi. El codi ara segueix més estrictament els principis de la programació orientada a objectes i els principis SOLID.
