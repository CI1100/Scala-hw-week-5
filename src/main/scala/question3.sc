def max_of_two(x: Int, y: Int):Int=
{
	if(x>=y)
	{
		return x;
	}
	return y;
}

def get_max():Int=
{
	println("Please enter value 1")
	val a = scala.io.StdIn.readInt()
	println("Please enter value 2")
	val b = scala.io.StdIn.readInt()
	return max_of_two(a, b);
}