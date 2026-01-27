package javadatabase;

public class Shopping{



public static void main(String[] args){

int shirt;
shirt=2000;
int shirtcount;
shirtcount=3;
int shirtprice;
shirtprice=shirt*shirtcount;
int pant;
pant=1700;
int pantcount;
pantcount=4;
int pantprice;
pantprice=pant*pantcount;
int shose;
shose=3000;
int shosecount;
shosecount=5;
int shoseprice;
shoseprice=shose*shosecount;
int total;
total=shirtprice+pantprice+shoseprice;
System.out.println(total);
int discountpercent;
discountpercent=27;
int GSTdiscountpercent;
GSTdiscountpercent=12;
int discount;
int GSTdiscount;
discount=total*discountpercent/100;
System.out.println(discount);
GSTdiscount=total*GSTdiscountpercent/100;
System.out.println(GSTdiscount);
int nettotal;
nettotal=total-discount+GSTdiscount;
System.out.println(nettotal);
}
	}

