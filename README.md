# Robot

Dans une matrice de taille n, vous controllez un robot grace à une série de direction contenue dans une chaine de caractère :

* N correspond à nord
* S correspond à sud
* E correspond à est
* W correspond à ouest

Le robot commence par le point le plus en haut à gauche de la grille, en (0, 0).
A chaque direction, le robot se déplace d'une case dans la grille.

Vous devez retourner le nombre de cases visitées par le robot (un robot peut passer plusieurs fois sur la même case, mais elle ne sera comptée comme visitée qu'une seul fois).
La première case (0, 0) est considérée comme visitée.

Exemple :

Soit une grille de taille 3 et la série de direction "EESNSSW".

Nous avons le robot effectuant le parcours suivant (à gauche la représentation graphique, et à droite la grille) :

	n=3, itinerary="EESNSSW"
	╔═════╗ 
	║ ──┐ ║ 	{1,1,1},	return=6
	║ ..│ ║  	{O,O,1},
	║ .─┘ ║ 	{O,1,1}
	╚═════╝

	n=5, itinerary="EESSWSSWNEEES"
	╔═══════╗
	║ ──┐.. ║ 	{1,1,1,0,0},	return=13
	║ ..│.. ║ 	{0,0,1,0,0},
	║ .┌┘.. ║ 	{0,1,1,0,0},
	║ ┌┼─┐. ║ 	{1,1,1,1,0},
	║ └┘.│. ║ 	{1,1,0,1,0}
	╚═══════╝

Bonus :

* si l'itinéraire fait sortir le robot du tableau, relever une IndexOutOfBoundsException avec le message "Robot is out of bounds".
* si n est <= 0, relever une IllegalArgumentException avec le message "n <= 0".

Rappel des commandes junit :

    javac -cp .:junit-4.12.jar RobotTest.java
    java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore RobotTest
