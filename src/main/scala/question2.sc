val nums: List[Int] = List.range(1, 46)

val is_div_by_4 = (x: Int) => x % 4 == 0

var div_4_nums: List[Int] = nums.filter(is_div_by_4)
println(div_4_nums.sum);

def filtration_logic(x: Int): Boolean  =
{
	if((x%3==0)&&(x<20))
	{
		return true
	}
	else
	{
		return false
	}
}

var filtered: List[Int] = nums.filter(filtration_logic)

println(filtered.sum); 