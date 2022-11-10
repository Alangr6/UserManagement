//import java.util.Scanner;
//
///**
// * 
// */
///**
// * @author alaguerr
// *
// */
//	Scanner sc = new Scanner(System.in);
//				int option = sc.nextInt();
//				System.out.println(
//						"Elige que quieres hacer\n 1=establecer pregunta de seguridad\n 2=modificar email\n 3=modificar contraseña\n 4=Logout");
//
//				switch (option) {
//				case 1: {
//					System.out.println("establecer pregunta de seguridad");
//
//					System.out.println("Añada su pregunta de seguridad:");
//					String securityQuestion = sc.nextLine();
//					u.setSecurityQuestion(securityQuestion);
//break;
//
//				}
//				case 2: {
//					System.out.println("Modificar email");
//
//					System.out.println("Añada su direccion email:");
//					String emailCreate = sc.nextLine();
//					u.setEmail(emailCreate);
// break;
//				}
//				case 3: {
//					System.out.println("Reestablecer contraseña");
//
//					System.out.println("Añada su nueva contraseña:");
//					String passwordLogin = sc.nextLine();
//					u.setPassword(passwordLogin);
//break;
//				}
//				default:
//					throw new IllegalArgumentException("Unexpected value: " + option);
//				}
//			} else {
//				System.out.println("Algo ha ido mal");
//			}
//module Login {
//}