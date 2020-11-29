package test;



import java.util.ArrayList;
public class test {
public static void main(String[] args) {
int n = 11, c = 2, k = 3;
// 1. Input numbers in array from 1 to n.
int counter = 1;
ArrayList<Integer> N = new ArrayList<>();
for (int i = 0; i < n; i++) {
N.add( counter++ );
}
// 2. We start counting until reaching c and remove the element.
// Then start counting from 1 after the deleted item.
System.out.println( N.toString() );

int x=0;
while (k != N.size()) {
	 x+=c % N.size();
	if( x==0)
N.remove( N.size()-1);
	else N.remove(x-1);
	x--;
	System.out.println( N.toString() );

}
}}