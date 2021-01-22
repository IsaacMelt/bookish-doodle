import entities.CalculInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try{
            CalculInterface calculInterface = (CalculInterface) Naming.lookup("//localhost/server");

            int a,b,c;

            System.out.println("Программа высчитывает усреднённую стоимость подписок на 3 различные программы");
            System.out.println("Введите стоимость подписки A");
            a = scanner.nextInt();
            System.out.println("Введите стоимость подписки B");
            b = scanner.nextInt();
            System.out.println("Введите стоимость подписки C");
            c = scanner.nextInt();
            System.out.println("Средняя стоимость подписок =  "+ calculInterface.add(a,b,c));

        }
        catch (RemoteException | NotBoundException | MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}
