package com.venancio.daw.tema2;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		ejercicio9();
	}
	
	private static void ejercicio9() {
		
		Scanner sc9 = new Scanner(System.in);
			
			System.out.println("Introduce tu día de nacimiento: ");
			int dia = sc9.nextInt();
			
			System.out.println("Introduce tu mes de nacimiento en numero: ");
			int mes = sc9.nextInt();
			sc9.close();
			
		/*	if ((dia >= 19 && dia <=20) && (mes >= 1 && mes <=2)) {
				System.out.println("Eres Acuario");
			} else if ((dia >= 1 && dia <=20) && (mes >= 2 && mes <=3)) {
				
			}
		*/
			
			if (mes == 1 && (dia >= 20 && dia <= 31)) {
				System.out.println("Acuario");
			}else if (mes == 2 && (dia >= 1 && dia <= 19)) {
				System.out.println("Acuario");
			}
				else if (mes == 2 && (dia >= 20 && dia <= 28)) {
					System.out.println("Piscis");
				}else if (mes == 3 && (dia >= 1 && dia <= 20)) {
					System.out.println("Piscis");
				}
					else if (mes == 3 && (dia >= 21 && dia <= 31)) {
						System.out.println("Aries");
					}else if (mes == 4 && (dia >= 1 && dia <= 20)) {
						System.out.println("Aries");
					}
						else if (mes == 4 && (dia >= 21 && dia <= 30)) {
							System.out.println("Tauro");
						}else if (mes == 5 && (dia >= 1 && dia <= 21)) {
							System.out.println("Tauro");
						}
							else if (mes == 5 && (dia >= 22 && dia <= 31)) {
								System.out.println("Géminis");
							}else if (mes == 6 && (dia >= 1 && dia <= 21)) {
								System.out.println("Géminis");
							}
								else if (mes == 6 && (dia >= 22 && dia <= 30)) {
									System.out.println("Cancer");
								}else if (mes == 7 && (dia >= 1 && dia <= 23)) {
									System.out.println("Cancer");
								}
									else if (mes == 7 && (dia >= 24 && dia <= 31)) {
										System.out.println("Leo");
									}else if (mes == 8 && (dia >= 1 && dia <= 23)) {
										System.out.println("Leo");
									}
										else if (mes == 8 && (dia >= 24 && dia <= 31)) {
											System.out.println("Virgo");
										}else if (mes == 9 && (dia >= 1 && dia <= 22)) {
											System.out.println("Virgo");
										}
											else if (mes == 9 && (dia >= 23 && dia <= 30)) {
												System.out.println("Libra");
											}else if (mes == 10 && (dia >= 1 && dia <= 22)) {
												System.out.println("Libra");
											}
												else if (mes == 10 && (dia >= 23 && dia <= 31)) {
													System.out.println("Escorpio");
												}else if (mes == 11 && (dia >= 1 && dia <= 22)) {
													System.out.println("Escorpio");
												}
													else if (mes == 11 && (dia >= 23 && dia <= 30)) {
														System.out.println("Sagitario");
													}else if (mes == 12 && (dia >= 1 && dia <= 21)) {
														System.out.println("Sagitario");
													}
														else if (mes == 12 && (dia >= 22 && dia <= 31)) {
															System.out.println("Capricornio");
														}else if (mes == 1 && (dia >= 1 && dia <= 19)) {
															System.out.println("Capricornio");
														}
															else{
																System.out.println("Me he tirado un rato de narices picando código; mete un numero positivo");
															}
		/*	
			Meses		
			Enero		31
			Febrero		28
			Marzo		31
			Abril		30
			Mayo		31
			Junio		30
			Julio		31
			Agosto		31
			Septiembre	30
			Octubre		31
			Noviembre	30	
			Diciembre	31
		*/			
		//	Cual es el signo del zodiaco
		/*
			ACUARIO : 20/1 - 19/2	*
			PISCIS: 20/2 - 20/3		*
			ARIES : 21/3 - 20/4		*
			TAURO : 21/4 - 21/5		*
			GÉMINIS : 22/5 - 21/6	*
			CÁNCER : 22/6 - 23/7	*
			LEO : 24/7 - 23/8		*
			VIRGO : 24-8 - 22/9		*
			LIBRA : 23/9 - 22/10	*
			ESCORPIO : 23/10 - 22/11	*
			SAGITARIO : 23/11 - 21/12	*
			CAPRICORNIO : 22/12 - 19/1	*
		*/
		
					
	}
}
