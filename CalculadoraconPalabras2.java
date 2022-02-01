Scanner entrada = new Scanner(System.in);
		
		String valorUno, valorDos, strCompara = "";
		
		int numOpcion, varUno, varDos, repetir;
		
		double divResultado;
		
		System.out.println("*************");
		System.out.println("  Bienvenidos a nuestro programa :D");
		System.out.println("*************");

		System.out.println("Ingrese la primer palabra: ");
		valorUno = entrada.nextLine();
		
		System.out.println("Ingrese la segundo palabra: ");
		valorDos = entrada.nextLine();
		
		varUno = valorUno.compareTo(strCompara);
		varDos = valorDos.compareTo(strCompara);
		
		do {
			System.out.println("*************");
			System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division");
			System.out.println("*************");
			System.out.print("Digite la opcion: ");
			numOpcion = entrada.nextInt();
			
			switch (numOpcion) {
				case 1:
					System.out.println(varUno+varDos);
					break;
				case 2:
					System.out.println(varUno-varDos);
					break;
				case 3:
					System.out.println(varUno*varDos);
					break;
				case 4:
					if(varDos!=0) {
						double varUnoD = (int)varUno;
						double varDosD = (int)varDos;
						divResultado = varUnoD/varDosD;
						System.out.println(divResultado);
					}else {
						System.out.println("No se puede dividir entre cero porque no escribiste la segunda palabra :'(");
					}
					break;
				default:
					System.out.println("La opcion digitada no existe");
			}

			System.out.println("*************");
			System.out.println("¿Quieres hacer un nuevo calculo?\nEscribe\nSi = 1\nNo = 0");
			repetir = entrada.nextInt();
		}while(repetir == 1);