package login;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int option;
		do {
			System.out.println(
					"Elige que quieres hacer\n 1=Iniciar sesion\n 2=Crear usuario\n 3=Mostrar usuarios\n 7=Salir");
			option = sc.nextInt();
			sc.nextLine();
			switch (option) {

			case 2: {
				System.out.println("Crear usuario");
				System.out.println("Añada su nombre de usuario:");
				String username = sc.nextLine();

				System.out.println("Añada su direccion email:");
				String emailCreate = sc.nextLine();

				System.out.println("Añada su contraseña:");
				String passwordCreate = sc.nextLine();

				User user = new User(username, emailCreate, passwordCreate);
				UserList.addUser(user);
				break;
			}
			case 3: {
				UserList.showUsers();
				break;
			}
			case 1: {
				UserList user = new UserList();

				System.out.println("Iniciar sesion");

				System.out.println("Añada su direccion email:");
				String emailLogin = sc.nextLine();

				System.out.println("Añada una contraseña:");
				String passwordLogin = sc.nextLine();
				user.userLogin(emailLogin, passwordLogin);
				User u = user.getUser(emailLogin);

				while (UserList.auth) {
					System.out.println(
							"Elige que quieres hacer\n 1=establecer pregunta de seguridad\n 2=modificar email\n 3=modificar contraseña\n 4=Enviar mensaje\n 5=Ver tus mensajes\n 6=Logout");
					sc = new Scanner(System.in);
					option = sc.nextInt();
					sc.nextLine();
					switch (option) {
					case 1: {
						System.out.println("establecer pregunta de seguridad");

						System.out.println("Añada su pregunta de seguridad:");
						String securityQuestion = sc.nextLine();
						u.setSecurityQuestion(securityQuestion);
						break;

					}
					case 2: {
						System.out.println("Modificar email");

						System.out.println("Añada su nueva direccion email:");
						String emailCreate = sc.nextLine();
						u.setEmail(emailCreate);
						break;
					}
					case 3: {
						System.out.println("Restablecer contraseña");

						System.out.println("Añada su nueva contraseña:");
						passwordLogin = sc.nextLine();
						u.setPassword(passwordLogin);

						break;
					}

					case 6: {
						UserList.userLogout();
						break;
					}
					case 4: {

						System.out.println("Enviar mensaje, elige a quien enviarselo");
						UserList.showUsers();
						option = sc.nextInt();
						User userMessageSent = UserList.userList.get(option - 1);

						System.out.println("Escribe el mensaje");
						sc.nextLine();
						String message = sc.nextLine();

						userMessageSent.sendMessage(message);
						break;

					}
					case 5: {

						System.out.println("Tus mensajes");
						u.showMessages();
						break;
					}
					}

				}
			}

			default:
				// throw new IllegalArgumentException("Unexpected value: " +);
			}
		} while (option != 7);

	}

}
