/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.rmi;
import java.rmi.*;
import java.rmi.registry.*;
public class SearchServer
{
	public static void main(String args[])
	{
		try
		{
			Search obj = new SearchQuery();

			LocateRegistry.createRegistry(1900);

			Naming.rebind("rmi://localhost:1900"+"/geeksforgeeks",obj);
		}
		catch(Exception ae)
		{
			System.out.println(ae);
		}
	}
}

