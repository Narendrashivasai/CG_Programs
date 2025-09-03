package com.codegnan.controlstatements;

import java.util.Scanner;

public class TalkTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the mins:");
				int t =sc.nextInt();
				if(t>=90) {
					System.out.println("Grade O");
				}else {
					if(t>=80) {
						System.out.println("Grade S");
					}else { 
						if(t>= 70) {
							System.out.println("Grade A");
						}else {
							if(t>=60) {
								System.out.println("Grade B");
						
									}else {
										System.out.println("Grade F");
									}
								}
					}
				}
			}
				}
			}
		}


	}

}
