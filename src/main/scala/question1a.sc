def greet1(name: String): String =
{
	var  greet:String = f"Hello ${name}, how are you doing?";
	//println(greet);
	return greet;
}

def greet2(name: String): String =
{
	var  greet:String = f"Hey ${name}, how was your day?"
	//println(greet);
	return greet;
}

def frame(name: String, g:String => String): Unit =
{
	var greet:String = g(name);
	println(greet);
}