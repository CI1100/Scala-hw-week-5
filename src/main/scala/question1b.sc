val nums: List[Int] = List.range(1, 10)

val is_odd = (x: Int) => x % 2 == 1

var filtered: List[Int] = nums.filter(is_odd)

val cube = (x: Int) => x*x*x

var cubed: List[Int] = filtered.map(cube)

for(i <- cubed)
{
	println(i);
}