lass Division


{


static void Main()


{


 int c=0;


 Console.WriteLine("Enter Dividend:");


 double N= double.Parse(Console.ReadLine());


 Console.Write("Enter Divisor:");


 double D =double.Parse(Console.ReadLine());


 if(N== 0)


{


  Console.WriteLine("Quotent =0");


return;


}


 


else if(D ==0)


{


  Console.WriteLine("Divided By Zero");


return;


}


 else


 { 


  while(N>=D)


        {


         c+=1;


         N = N-D;


   


        }


Console.WriteLine("Quetiont ={0}",c);


 


}


 


 


 


}