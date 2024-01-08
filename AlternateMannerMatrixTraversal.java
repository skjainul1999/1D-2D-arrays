// Question Link-- https://course.acciojob.com/idle?question=01775dbc-41a0-4dc7-842d-bb3175e4762d

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc=new Scanner(System.in);
                int row=sc.nextInt();
                int col=sc.nextInt();
                int a[][]=new int[row][col];
                for(int i=0;i<row;i++)
                 {
                          for(int j=0;j<col;j++)
                          {
                               a[i][j]=sc.nextInt();
                          }       
                }        
                for(int i=0;i<row;i++)
                {
                        if(i%2==0)
                        {
                                for(int j=0;j<col;j++)
                                {
                                        System.out.print(a[i][j]+" ");
                                }      
                        } 
                        else
                        {
                                for(int j=(col-1);j>=0;j--)
                                {
                                           System.out.print(a[i][j]+" ");      
                                }       
                        }       
                }       
	}
}
