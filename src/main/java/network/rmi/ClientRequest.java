/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package network.rmi;
// Java program for client application
import java.rmi.*;
public class ClientRequest
{
	public static void main(String args[])
	{
		String answer,value="Reflection in Java";
		try
		{
			Search access =
				(Search)Naming.lookup("rmi://localhost:1900"+"/geeksforgeeks");
			answer = access.query(value);
			System.out.println("Article on " + value +
							" " + answer);
		}
		catch(Exception ae)
		{
			System.out.println(ae);
		}
	}
}
