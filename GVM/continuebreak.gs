print("begin");
for( var i=0;i<1000000;i=i+1)
{
	print(i);
	continue;
	print("continue in for failed");
}

i = 0;
while( i<100 )
{
	print("while");
	i=i+1;
	continue;
	print("continue in while failed");
}