package com.cg.insurance.pl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.insurance.bean.Insured;
import com.cg.insurance.bean.PolicyBean;
import com.cg.insurance.bean.PolicyDetailsBean;
import com.cg.insurance.service.IInsured;
import com.cg.insurance.service.IInsuredImpl;

public class InsuranceMain {

	
	static Scanner sc = null;
	public static void main(String[] args) throws Exception {
		
		
		boolean role=true;
		while(role) {
			System.out.println("*---*---*----*---*---*---*---*-");
			System.out.println("---*-Welcome to Home page--*---");
			System.out.println("*---*---*----*---*---*---*---*-");
			System.out.println("   1. Insured User             ");
			System.out.println("   2. Insurance Agent          ");
			System.out.println("   3. UnderWriter or Admin     ");
			System.out.println("                               ");
			System.out.println("--*---*-Choose your role--*----");
			
			sc = new Scanner(System.in);
			int option;
			System.out.println(" choose your role...");
			option = sc.nextInt();
			
			while(true) {
				switch(option) {
				case 1:
					System.out.println("--*---*---*---*---*---*---*--*---");
					System.out.println("     Welcome Insured User        ");
					System.out.println("*---*---*----*---*---*---*---*---");
					System.out.println("  1. Search schemes              ");
					System.out.println("  2. View existing Schemes       ");
					System.out.println("  3. Request for Scheme          ");
					System.out.println("  4. Exit                        ");
					System.out.println("                                 ");
					System.out.println("--*---*-Choose your option--*----");
					boolean opt = true;
					while(opt) {
						int option1=0;
						System.out.println(" ");
						option1 = sc.nextInt();
						switch(option1) {
							case 1:
								IInsured  iInsured = new IInsuredImpl();
								List<PolicyBean> al = new ArrayList<>();
								al = iInsured.viewAllPolicies();
								System.out.println("nothing is in database");
								while(!al.isEmpty()) {
									System.out.println(al);
								}
								break;
								
							case 2:
								IInsured iInsured1 =new IInsuredImpl();
								String userName=null;
								System.out.println(" enter your username  ");
								userName = sc.next();
								List<PolicyDetailsBean> arl=new ArrayList();
								arl=iInsured1.viewMyPolicies(userName);
								while(!arl.isEmpty()) {
									System.out.println(arl);
								}
								break;
								
							case 3:
								System.out.println(" enter details and get scheme");
						       break;
							case 4:
								System.exit(0);
							default:
								System.out.println("enter valid option.....");
								break;
						}
						opt=false;
					}
					break;
					
				case 2:
					
					System.out.println("--*---*---*---*---*---*---");
					System.out.println("  Welcome Insurance Agent ");
					System.out.println("--*---*---*---*---*--*---*");
					System.out.println("  1. Create Account as requested ");
					System.out.println("  2. View Customer Details(corresponding) ");
					System.out.println("  3. Exit                        ");
					System.out.println("                                 ");
					System.out.println("--*---*-Choose your option--*----");
					
					int option2=0;
					System.out.println(" enter option    ");
					option2 = sc.nextInt();
					boolean opt2 = true;
					
					
					while(opt2) {
						switch(option2) {
							case 1:
								System.out.println(" take details from user and create account   ");
								break;
							case 2:
								System.out.println(" get details of particulat agent             ");
								break;
							case 3:
								System.exit(0);
							default:
								System.out.println("..oops ...wrong option........");
								break;
						}
						opt2 = false;
					}
					break;
					
				case 3:
					System.out.println("--*---*---*---*---*---*---*---*--");
					System.out.println("        Welcome Admin            ");
					System.out.println("                                 ");
					System.out.println("*---*---*----*---*---*---*---*---");
					System.out.println("  1. Search schemes              ");
					System.out.println("  2. View existing Schemes       ");
					System.out.println("  3. Request for Scheme          ");
					System.out.println("  4. Create Account as requested ");
					System.out.println("  5. View Customer Details(corresponding) ");
					System.out.println("  6. Create scheme               ");
					System.out.println("  7. Generate Report             ");
					System.out.println("  8. Exit                        ");
					System.out.println("                                 ");
					System.out.println("--*---*-Choose your option--*----");
					
					int option3 = 0;
					System.out.println(" enter option from above menu    ");
					option3 = sc.nextInt();
					boolean opt3 = true;
					
					while(opt3) {
						switch(option3) {
							case 1:
								System.out.println(" show schemes ");
								break;
							case 2:
								System.out.println(" view schemes of user");
								break;
							case 3:
								System.out.println(" enter details and get scheme");
								break;
							case 4:
								System.out.println(" take details from user and create account   ");
								break;
							case 5:
								System.out.println(" get details of particulat agent             ");
								break;     
							case 6:
								System.out.println(" Created new schemes           ");
								break;
							case 7:
								System.out.println(" Generated report              ");
								break;
							case 8:System.out.println("exit");
						    	System.exit(0);
							default:
								System.out.println(" enter valid option ");
								break;
						}
						opt3=false;
					}
					break;
				case 4:
					System.exit(0);
				default:System.out.println("enter valid option    ");
				   break;
				}
			}
		}
		role = false;
	}
}
