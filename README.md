Intention : To learn and code the basic outlines of some important Design Patterns known.

Patterns to learn :
1. Chain of responsibility
2. Observer

3. Iterator:
Ways to implement the iterator :
	1. Using an inner class
	2. Making the ContainerIterator class extend Container class
	3. Implement an Iterator interface and then make Container class implement it.

TODO : Find out the best approach by looking into the Java Library.

4. Singleton in two flavours - Eager Instllation and Lazy Installation


5. FlyWeight Pattern :
Not memory friendly if you create 1000 PointIcon objects for 1000 CAFEs; they are the same icon which can be created once and used in all 1000 places.

PointType  -> enum { CAFE, SCHOOL};
PointIcon  -> { PointType, IconImage};
PointIconFactory -> Checks if we already have a pointIcon object that can be used.

Point -> class {lat, long, PointIcon}
PointService -> class {List<Point>}
PointService class exposes a method getPoints to the client code.

6. Composite Pattern :

7. Strategy Pattern. This pattern very closely resembles State Pattern.
