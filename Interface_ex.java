interface Sum{
int a=10;
void AA();
}

interface Sub{
int b=20;
void BB();
}

class interface_ex implements Sum,Sub{

public void AA(){
System.out.println(a+b);
}

public void BB(){
System.out.println(a-b);
}

public static void main(String args[]){
interface_ex obj = new interface_ex();
obj.AA();
obj.BB();
}
}