package Trabalho;

import java.util.Scanner;

public class ALG_PedroMartins {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username, password, cat1, cat2, nomeprod1, nomeprod2, nomeprod3, nomeprod4;
        int login, opcao, codigo, addstock;
        int codprod1l1, codprod2l1, codprod3l1, codprod4l1;
        int codprod1l2, codprod2l2, codprod3l2, codprod4l2;
        int stockprod1l1, stockprod2l1, stockprod3l1, stockprod4l1;
        int stockprod1l2, stockprod2l2, stockprod3l2, stockprod4l2;
        double precoprod1, precoprod2, precoprod3, precoprod4;
        double totall1, totall2;
        boolean loginon = true;

        login = 0;
        nomeprod1 = "Marlboro";
        nomeprod2 = "Camel";
        nomeprod3 = "Winston";
        nomeprod4 = "Kent";
        codprod1l1 = 1001;
        codprod2l1 = 1002;
        codprod3l1 = 1003;
        codprod4l1 = 1004;
        codprod1l2 = 1011;
        codprod2l2 = 1012;
        codprod3l2 = 1013;
        codprod4l2 = 1014;
        cat1 = "Bom";
        cat2 = "Mau";
        precoprod1 = 6.1;
        stockprod1l1 = 0;
        stockprod1l2 = 0;
        precoprod2 = 5.8;
        stockprod2l1 = 0;
        stockprod2l2 = 0;
        precoprod3 = 5;
        stockprod3l1 = 0;
        stockprod3l2 = 0;
        precoprod4 = 4.5;
        stockprod4l1 = 0;
        stockprod4l2 = 0;

        do {

            System.out.println("----------------------------");
            System.out.print("Introduza o username (\"sair\" para sair): ");
            username = input.next().toLowerCase();

            if (username.equals("sair")) {

                loginon = false;
            } else {

                System.out.print("Introduza a password: ");
                password = input.next();

                if (username.equals("loja1") && password.equals("loja1")) {

                    login = 1;
                }

                if (username.equals("loja2") && password.equals("loja2")) {

                    login = 2;
                }
            }


            do {

                if (login == 1) {

                    do {

                        System.out.println("----------------------------");
                        System.out.println("Lojado como Loja 01");
                        System.out.println("----------------------------");
                        System.out.println("1. Consultar informações");
                        System.out.println("2. Adquirir");
                        System.out.println("3. Vender");
                        System.out.println("4. Transferir Stock entre lojas");
                        System.out.println("5. Simular venda total - loja autal");
                        System.out.println("6. Simular venda total - Todas as lojas");
                        System.out.println("7. Loja com maior valor");
                        System.out.println("8. Logout");
                        System.out.println("----------------------------");
                        System.out.print("Introduza a opção pretendida: ");
                        opcao = input.nextInt();

                        switch (opcao) {

                            case 1:

                                System.out.println("----------------------------");
                                System.out.println(codprod1l1 + " - " + nomeprod1);
                                System.out.println(codprod2l1 + " - " + nomeprod2);
                                System.out.println(codprod3l1 + " - " + nomeprod3);
                                System.out.println(codprod4l1 + " - " + nomeprod4);
                                System.out.println("----------------------------");
                                System.out.print("Indique o código do produto que pretende consultar: ");
                                codigo = input.nextInt();
                                System.out.println("----------------------------");

                                if (codigo == codprod1l1) {

                                    System.out.println("Produto: " + nomeprod1 + " (" + codprod1l1 + ")");
                                    System.out.println("Preço: " + precoprod1);
                                    System.out.println("Categoria: " + cat1);
                                    System.out.println("Stock em loja: " + stockprod1l1);

                                } else if (codigo == codprod2l1) {

                                    System.out.println("Produto: " + nomeprod2 + " (" + codprod2l1 + ")");
                                    System.out.println("Preço: " + precoprod2);
                                    System.out.println("Categoria: " + cat1);
                                    System.out.println("Stock em loja: " + stockprod2l1);

                                } else if (codigo == codprod3l1) {

                                    System.out.println("Produto: " + nomeprod3 + " (" + codprod3l1 + ")");
                                    System.out.println("Preço: " + precoprod3);
                                    System.out.println("Categoria: " + cat2);
                                    System.out.println("Stock em loja: " + stockprod3l1);

                                } else if (codigo == codprod4l1) {

                                    System.out.println("Produto: " + nomeprod4 + " (" + codprod4l1 + ")");
                                    System.out.println("Preço: " + precoprod4);
                                    System.out.println("Categoria: " + cat2);
                                    System.out.println("Stock em loja: " + stockprod4l1);

                                } else {

                                    System.out.println("Código inexistente!");

                                }

                                break;

                            case 2:

                                System.out.println("----------------------------");
                                System.out.println(codprod1l1 + " - " + nomeprod1);
                                System.out.println(codprod2l1 + " - " + nomeprod2);
                                System.out.println(codprod3l1 + " - " + nomeprod3);
                                System.out.println(codprod4l1 + " - " + nomeprod4);
                                System.out.println("----------------------------");
                                System.out.print("Indique o código do produto: ");
                                codigo = input.nextInt();

                                if (codigo == codprod1l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod1 + " (" + codprod1l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod1l1);
                                } else if (codigo == codprod2l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod2 + " (" + codprod2l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod2l1);
                                } else if (codigo == codprod3l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod3 + " (" + codprod3l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod3l1);
                                } else if (codigo == codprod4l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod4 + " (" + codprod4l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod4l1);
                                } else {

                                    System.out.println("----------------------------");
                                    System.out.println("Código inexistente!");
                                }

                                if (codigo == codprod1l1 || codigo == codprod2l1 || codigo == codprod3l1 || codigo == codprod4l1) {
                                    System.out.println("----------------------------");
                                    System.out.print("Quanto quer adicionar? ");
                                    addstock = input.nextInt();
                                    System.out.println("----------------------------");

                                    while (addstock < 0) {

                                        System.out.print("Por favor introduza um valor maior ou igual a 0:");
                                        addstock = input.nextInt();
                                        System.out.println("----------------------------");
                                    }

                                    if (codigo == codprod1l1) {

                                        stockprod1l1 = stockprod1l1 + addstock;
                                        System.out.println("Produto: " + nomeprod1 + " (" + codprod1l1 + ")");
                                        System.out.println("Stock em loja: " + stockprod1l1);
                                    }

                                    if (codigo == codprod2l1) {

                                        stockprod2l1 = stockprod2l1 + addstock;
                                        System.out.println("Produto: " + nomeprod2 + " (" + codprod2l1 + ")");
                                        System.out.println("Stock em loja: " + stockprod2l1);
                                    }

                                    if (codigo == codprod3l1) {

                                        stockprod3l1 = stockprod3l1 + addstock;
                                        System.out.println("Produto: " + nomeprod3 + " (" + codprod3l1 + ")");
                                        System.out.println("Stock em loja: " + stockprod3l1);
                                    }

                                    if (codigo == codprod4l1) {

                                        stockprod4l1 = stockprod4l1 + addstock;
                                        System.out.println("Produto: " + nomeprod4 + " (" + codprod4l1 + ")");
                                        System.out.println("Stock em loja: " + stockprod4l1);
                                    }
                                }
                                break;

                            case 3:

                                System.out.println("----------------------------");
                                System.out.println(codprod1l1 + " - " + nomeprod1);
                                System.out.println(codprod2l1 + " - " + nomeprod2);
                                System.out.println(codprod3l1 + " - " + nomeprod3);
                                System.out.println(codprod4l1 + " - " + nomeprod4);
                                System.out.println("----------------------------");
                                System.out.print("Indique o código do produto: ");
                                codigo = input.nextInt();

                                if (codigo == codprod1l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod1 + " (" + codprod1l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod1l1);
                                } else if (codigo == codprod2l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod2 + " (" + codprod2l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod2l1);
                                } else if (codigo == codprod3l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod3 + " (" + codprod3l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod3l1);
                                } else if (codigo == codprod4l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod4 + " (" + codprod4l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod4l1);
                                } else {

                                    System.out.println("----------------------------");
                                    System.out.println("Código inexistente!");
                                }

                                if (codigo == codprod1l1 || codigo == codprod2l1 || codigo == codprod3l1 || codigo == codprod4l1) {
                                    System.out.println("----------------------------");
                                    System.out.print("Quantos vendeu? ");
                                    addstock = input.nextInt();
                                    System.out.println("----------------------------");

                                    while (addstock < 0) {

                                        System.out.print("Por favor introduza um valor maior ou igual a 0:");
                                        addstock = input.nextInt();
                                        System.out.println("----------------------------");
                                    }

                                    if (codigo == codprod1l1) {

                                        if (stockprod1l1 - addstock >= 0) {
                                            stockprod1l1 = stockprod1l1 - addstock;
                                            System.out.println("Produto: " + nomeprod1 + " (" + codprod1l1 + ")");
                                            System.out.println("Stock em loja: " + stockprod1l1);
                                        } else {
                                            System.out.println("Não tem suficiente!");
                                        }
                                    }

                                    if (codigo == codprod2l1) {

                                        if (stockprod2l1 - addstock >= 0) {
                                            stockprod2l1 = stockprod2l1 - addstock;
                                            System.out.println("Produto: " + nomeprod2 + " (" + codprod2l1 + ")");
                                            System.out.println("Stock em loja: " + stockprod2l1);
                                        } else {
                                            System.out.println("Não tem suficiente!");
                                        }
                                    }

                                    if (codigo == codprod3l1) {

                                        if (stockprod3l1 - addstock >= 0) {
                                            stockprod3l1 = stockprod3l1 - addstock;
                                            System.out.println("Produto: " + nomeprod3 + " (" + codprod3l1 + ")");
                                            System.out.println("Stock em loja: " + stockprod3l1);
                                        } else {
                                            System.out.println("Não tem suficiente!");
                                        }
                                    }

                                    if (codigo == codprod4l1) {

                                        if (stockprod4l1 - addstock >= 0) {
                                            stockprod4l1 = stockprod4l1 - addstock;
                                            System.out.println("Produto: " + nomeprod4 + " (" + codprod4l1 + ")");
                                            System.out.println("Stock em loja: " + stockprod4l1);
                                        } else {
                                            System.out.println("Não tem suficiente!");
                                        }
                                    }
                                }

                                break;

                            case 4:

                                System.out.println("----------------------------");
                                System.out.println(codprod1l1 + " - " + nomeprod1);
                                System.out.println(codprod2l1 + " - " + nomeprod2);
                                System.out.println(codprod3l1 + " - " + nomeprod3);
                                System.out.println(codprod4l1 + " - " + nomeprod4);
                                System.out.println("----------------------------");
                                System.out.print("Indique o código do produto: ");
                                codigo = input.nextInt();

                                if (codigo == codprod1l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod1 + " (" + codprod1l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod1l1);
                                } else if (codigo == codprod2l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod2 + " (" + codprod2l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod2l1);
                                } else if (codigo == codprod3l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod3 + " (" + codprod3l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod3l1);
                                } else if (codigo == codprod4l1) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod4 + " (" + codprod4l1 + ")");
                                    System.out.println("Stock em loja: " + stockprod4l1);
                                } else {

                                    System.out.println("----------------------------");
                                    System.out.println("Código inexistente!");
                                }

                                if (codigo == codprod1l1 || codigo == codprod2l1 || codigo == codprod3l1 || codigo == codprod4l1) {
                                    System.out.println("----------------------------");
                                    System.out.print("Quanto quer transferir para a Loja 02? ");
                                    addstock = input.nextInt();
                                    System.out.println("----------------------------");

                                    while (addstock < 0) {

                                        System.out.print("Por favor introduza um valor maior ou igual a 0:");
                                        addstock = input.nextInt();
                                        System.out.println("----------------------------");
                                    }


                                    if (codigo == codprod1l1) {

                                        if (stockprod1l1 - addstock >= 0) {
                                            stockprod1l1 = stockprod1l1 - addstock;
                                            stockprod1l2 = stockprod1l2 + addstock;
                                            System.out.println("Produto: " + nomeprod1 + " (" + codprod1l1 + ")");
                                            System.out.println("Stock em loja 1: " + stockprod1l1);
                                            System.out.println("Stock em loja 2: " + stockprod1l2);

                                        } else {

                                            System.out.println("Não tem quantidade suficiente!");
                                        }
                                    }

                                    if (codigo == codprod2l1) {

                                        if (stockprod2l1 - addstock >= 0) {
                                            stockprod2l1 = stockprod2l1 - addstock;
                                            stockprod2l2 = stockprod2l2 + addstock;
                                            System.out.println("Produto: " + nomeprod2 + " (" + codprod2l1 + ")");
                                            System.out.println("Stock em loja 1: " + stockprod2l1);
                                            System.out.println("Stock em loja 2: " + stockprod2l2);
                                        } else {

                                            System.out.println("Não tem quantidade suficiente!");
                                        }
                                    }

                                    if (codigo == codprod3l1) {

                                        if (stockprod3l1 - addstock >= 0) {
                                            stockprod3l1 = stockprod3l1 - addstock;
                                            stockprod3l2 = stockprod3l2 + addstock;
                                            System.out.println("Produto: " + nomeprod3 + " (" + codprod3l1 + ")");
                                            System.out.println("Stock em loja 1: " + stockprod3l1);
                                            System.out.println("Stock em loja 2: " + stockprod3l2);
                                        } else {

                                            System.out.println("Não tem quantidade suficiente!");
                                        }
                                    }


                                    if (codigo == codprod4l1) {


                                        if (stockprod4l1 - addstock >= 0) {
                                            stockprod4l1 = stockprod4l1 - addstock;
                                            stockprod4l2 = stockprod4l2 + addstock;
                                            System.out.println("Produto: " + nomeprod4 + " (" + codprod4l1 + ")");
                                            System.out.println("Stock em loja 1: " + stockprod4l1);
                                            System.out.println("Stock em loja 2: " + stockprod4l2);
                                        } else {

                                            System.out.println("Não tem quantidade suficiente!");
                                        }
                                    }
                                }
                                break;

                            case 5:

                                System.out.println("----------------------------");
                                totall1 = (precoprod1 * stockprod1l1) + (precoprod2 * stockprod2l1) + (precoprod3 * stockprod3l1) + (precoprod4 * stockprod4l1);
                                System.out.println("Valor total em loja: " + totall1 + " €");
                                break;

                            case 6:

                                System.out.println("----------------------------");
                                totall1 = (precoprod1 * stockprod1l1) + (precoprod2 * stockprod2l1) + (precoprod3 * stockprod3l1) + (precoprod4 * stockprod4l1);
                                totall2 = (precoprod1 * stockprod1l2) + (precoprod2 * stockprod2l2) + (precoprod3 * stockprod3l2) + (precoprod4 * stockprod4l2);
                                System.out.println("Valor total nas 2 lojas: " + (totall1 + totall2) + " €");
                                break;

                            case 7:

                                totall1 = (precoprod1 * stockprod1l1) + (precoprod2 * stockprod2l1) + (precoprod3 * stockprod3l1) + (precoprod4 * stockprod4l1);
                                totall2 = (precoprod1 * stockprod1l2) + (precoprod2 * stockprod2l2) + (precoprod3 * stockprod3l2) + (precoprod4 * stockprod4l2);

                                if (totall1 < totall2) {

                                    System.out.println("----------------------------");
                                    System.out.println("A loja com maior valor é a loja 2 com: " + totall2 + " €");
                                }

                                if (totall2 < totall1) {

                                    System.out.println("----------------------------");
                                    System.out.println("A loja com maior valor é a loja 1 com: " + totall1 + " €");
                                }

                                if (totall1 == totall2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Ambas as lojas têm o mesmo valor");
                                }
                                break;

                            case 8:

                                login = -1;
                                break;

                            default:

                                System.out.println("----------------------------");
                                System.out.println("Selecione uma opção válida.");
                                break;


                        }

                    } while (login > 0);
                }

                if (login == 2) {

                    do {

                        System.out.println("----------------------------");
                        System.out.println("Logado como Loja 02");
                        System.out.println("----------------------------");
                        System.out.println("1. Consultar informações");
                        System.out.println("2. Adquirir");
                        System.out.println("3. Vender");
                        System.out.println("4. Transferir Stock entre lojas");
                        System.out.println("5. Simular venda total - loja autal");
                        System.out.println("6. Simular venda total - Todas as lojas");
                        System.out.println("7. Loja com maior valor");
                        System.out.println("8. Logout");
                        System.out.println("----------------------------");
                        System.out.print("Introduza a opção pretendida: ");
                        opcao = input.nextInt();

                        switch (opcao) {

                            case 1:

                                System.out.println("----------------------------");
                                System.out.println(codprod1l2 + " - " + nomeprod1);
                                System.out.println(codprod2l2 + " - " + nomeprod2);
                                System.out.println(codprod3l2 + " - " + nomeprod3);
                                System.out.println(codprod4l2 + " - " + nomeprod4);
                                System.out.println("----------------------------");
                                System.out.print("Indique o código do produto que pretende consultar: ");
                                codigo = input.nextInt();
                                System.out.println("----------------------------");

                                if (codigo == codprod1l2) {

                                    System.out.println("Produto: " + nomeprod1 + " (" + codprod1l2 + ")");
                                    System.out.println("Preço: " + precoprod1);
                                    System.out.println("Categoria: " + cat1);
                                    System.out.println("Stock em loja: " + stockprod1l2);

                                } else if (codigo == codprod2l2) {

                                    System.out.println("Produto: " + nomeprod2 + " (" + codprod2l2 + ")");
                                    System.out.println("Preço: " + precoprod2);
                                    System.out.println("Categoria: " + cat1);
                                    System.out.println("Stock em loja: " + stockprod2l2);

                                } else if (codigo == codprod3l2) {

                                    System.out.println("Produto: " + nomeprod3 + " (" + codprod3l2 + ")");
                                    System.out.println("Preço: " + precoprod3);
                                    System.out.println("Categoria: " + cat2);
                                    System.out.println("Stock em loja: " + stockprod3l2);

                                } else if (codigo == codprod4l2) {

                                    System.out.println("Produto: " + nomeprod4 + " (" + codprod4l2 + ")");
                                    System.out.println("Preço: " + precoprod4);
                                    System.out.println("Categoria: " + cat2);
                                    System.out.println("Stock em loja: " + stockprod4l2);

                                } else {

                                    System.out.println("Código inexistente!");

                                }

                                break;

                            case 2:

                                System.out.println("----------------------------");
                                System.out.println(codprod1l2 + " - " + nomeprod1);
                                System.out.println(codprod2l2 + " - " + nomeprod2);
                                System.out.println(codprod3l2 + " - " + nomeprod3);
                                System.out.println(codprod4l2 + " - " + nomeprod4);
                                System.out.println("----------------------------");
                                System.out.print("Indique o código do produto: ");
                                codigo = input.nextInt();


                                if (codigo == codprod1l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod1 + " (" + codprod1l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod1l2);
                                } else if (codigo == codprod2l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod2 + " (" + codprod2l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod2l2);
                                } else if (codigo == codprod3l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod3 + " (" + codprod3l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod3l2);
                                } else if (codigo == codprod4l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod4 + " (" + codprod4l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod4l2);
                                } else {

                                    System.out.println("----------------------------");
                                    System.out.println("Código inexistente!");
                                }

                                if (codigo == codprod1l2 || codigo == codprod2l2 || codigo == codprod3l2 || codigo == codprod4l2) {
                                    System.out.println("----------------------------");
                                    System.out.print("Quanto quer adicionar? ");
                                    addstock = input.nextInt();
                                    System.out.println("----------------------------");

                                    while (addstock < 0) {

                                        System.out.print("Por favor introduza um valor maior ou igual a 0:");
                                        addstock = input.nextInt();
                                        System.out.println("----------------------------");
                                    }

                                    if (codigo == codprod1l2) {

                                        stockprod1l2 = stockprod1l2 + addstock;
                                        System.out.println("Produto: " + nomeprod1 + " (" + codprod1l2 + ")");
                                        System.out.println("Stock em loja: " + stockprod1l2);
                                    }

                                    if (codigo == codprod2l2) {

                                        stockprod2l2 = stockprod2l2 + addstock;
                                        System.out.println("Produto: " + nomeprod2 + " (" + codprod2l2 + ")");
                                        System.out.println("Stock em loja: " + stockprod2l2);
                                    }

                                    if (codigo == codprod3l2) {

                                        stockprod3l2 = stockprod3l2 + addstock;
                                        System.out.println("Produto: " + nomeprod3 + " (" + codprod3l2 + ")");
                                        System.out.println("Stock em loja: " + stockprod3l2);
                                    }

                                    if (codigo == codprod4l2) {

                                        stockprod4l2 = stockprod4l2 + addstock;
                                        System.out.println("Produto: " + nomeprod4 + " (" + codprod4l2 + ")");
                                        System.out.println("Stock em loja: " + stockprod4l2);
                                    }
                                }
                                break;

                            case 3:

                                System.out.println("----------------------------");
                                System.out.println(codprod1l2 + " - " + nomeprod1);
                                System.out.println(codprod2l2 + " - " + nomeprod2);
                                System.out.println(codprod3l2 + " - " + nomeprod3);
                                System.out.println(codprod4l2 + " - " + nomeprod4);
                                System.out.println("----------------------------");
                                System.out.print("Indique o código do produto: ");
                                codigo = input.nextInt();

                                if (codigo == codprod1l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod1 + " (" + codprod1l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod1l2);
                                } else if (codigo == codprod2l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod2 + " (" + codprod2l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod2l2);
                                } else if (codigo == codprod3l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod3 + " (" + codprod3l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod3l2);
                                } else if (codigo == codprod4l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod4 + " (" + codprod4l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod4l2);
                                } else {

                                    System.out.println("----------------------------");
                                    System.out.println("Código inexistente!");

                                }

                                if (codigo == codprod1l2 || codigo == codprod2l2 || codigo == codprod3l2 || codigo == codprod4l2) {
                                    System.out.println("----------------------------");
                                    System.out.print("Quantos vendeu? ");
                                    addstock = input.nextInt();
                                    System.out.println("----------------------------");

                                    while (addstock < 0) {

                                        System.out.println("Por favor introduza um valor maior ou igual a 0:");
                                        addstock = input.nextInt();
                                        System.out.println("----------------------------");
                                    }

                                    if (codigo == codprod1l2) {

                                        if (stockprod1l2 - addstock >= 0) {
                                            stockprod1l2 = stockprod1l2 - addstock;
                                            System.out.println("Produto: " + nomeprod1 + " (" + codprod1l2 + ")");
                                            System.out.println("Stock em loja: " + stockprod1l2);
                                        } else {

                                            System.out.println("Não tem suficiente!");
                                        }
                                    }

                                    if (codigo == codprod2l2) {

                                        if (stockprod2l2 - addstock >= 0) {
                                            stockprod2l2 = stockprod2l2 - addstock;
                                            System.out.println("Produto: " + nomeprod2 + " (" + codprod2l2 + ")");
                                            System.out.println("Stock em loja: " + stockprod2l2);
                                        } else {

                                            System.out.println("Não tem suficiente!");
                                        }
                                    }

                                    if (codigo == codprod3l2) {

                                        if (stockprod3l2 - addstock >= 0) {
                                            stockprod3l2 = stockprod3l2 - addstock;
                                            System.out.println("Produto: " + nomeprod3 + " (" + codprod3l2 + ")");
                                            System.out.println("Stock em loja: " + stockprod3l2);
                                        } else {

                                            System.out.println("Não tem suficiente!");
                                        }
                                    }

                                    if (codigo == codprod4l2) {

                                        if (stockprod4l2 - addstock >= 0) {
                                            stockprod4l2 = stockprod4l2 - addstock;
                                            System.out.println("Produto: " + nomeprod4 + " (" + codprod4l2 + ")");
                                            System.out.println("Stock em loja: " + stockprod4l2);
                                        } else {

                                            System.out.println("Não tem suficiente!");
                                        }
                                    }
                                }

                                break;

                            case 4:

                                System.out.println("----------------------------");
                                System.out.println(codprod1l2 + " - " + nomeprod1);
                                System.out.println(codprod2l2 + " - " + nomeprod2);
                                System.out.println(codprod3l2 + " - " + nomeprod3);
                                System.out.println(codprod4l2 + " - " + nomeprod4);
                                System.out.println("----------------------------");
                                System.out.print("Indique o código do produto: ");
                                codigo = input.nextInt();

                                if (codigo == codprod1l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod1 + " (" + codprod1l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod1l2);
                                } else if (codigo == codprod2l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod2 + " (" + codprod2l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod2l2);
                                } else if (codigo == codprod3l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod3 + " (" + codprod3l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod3l2);
                                } else if (codigo == codprod4l2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Produto: " + nomeprod4 + " (" + codprod4l2 + ")");
                                    System.out.println("Stock em loja: " + stockprod4l2);
                                } else {

                                    System.out.println("----------------------------");
                                    System.out.println("Código inexistente!");
                                }

                                if (codigo == codprod1l2 || codigo == codprod2l2 || codigo == codprod3l2 || codigo == codprod4l2) {
                                    System.out.println("----------------------------");
                                    System.out.print("Quanto quer transferir para a Loja 01? ");
                                    addstock = input.nextInt();
                                    System.out.println("----------------------------");

                                    while (addstock < 0) {
                                        System.out.print("Por favor introduza um valor maior ou igual a 0:");
                                        addstock = input.nextInt();
                                        System.out.println("----------------------------");

                                    }


                                    if (codigo == codprod1l2) {

                                        if (stockprod1l2 - addstock >= 0) {
                                            stockprod1l2 = stockprod1l2 - addstock;
                                            stockprod1l1 = stockprod1l1 + addstock;
                                            System.out.println("Produto: " + nomeprod1 + " (" + codprod1l2 + ")");
                                            System.out.println("Stock em loja 1: " + stockprod1l1);
                                            System.out.println("Stock em loja 2: " + stockprod1l2);

                                        } else {

                                            System.out.println("Não tem suficiente!");
                                        }
                                    }

                                    if (codigo == codprod2l2) {

                                        if (stockprod2l2 - addstock >= 0) {
                                            stockprod2l2 = stockprod2l2 - addstock;
                                            stockprod2l1 = stockprod2l1 + addstock;
                                            System.out.println("Produto: " + nomeprod2 + " (" + codprod2l2 + ")");
                                            System.out.println("Stock em loja 1: " + stockprod2l1);
                                            System.out.println("Stock em loja 2: " + stockprod2l2);

                                        } else {

                                            System.out.println("Não tem suficiente!");
                                        }
                                    }

                                    if (codigo == codprod3l2) {

                                        if (stockprod3l2 - addstock >= 0) {
                                            stockprod3l2 = stockprod3l2 - addstock;
                                            stockprod3l1 = stockprod3l1 + addstock;
                                            System.out.println("Produto: " + nomeprod3 + " (" + codprod3l2 + ")");
                                            System.out.println("Stock em loja 1: " + stockprod3l1);
                                            System.out.println("Stock em loja 2: " + stockprod3l2);

                                        } else {

                                            System.out.println("Não tem suficiente!");
                                        }
                                    }

                                    if (codigo == codprod4l2) {

                                        if (stockprod4l2 - addstock >= 0) {
                                            stockprod4l2 = stockprod4l2 - addstock;
                                            stockprod4l1 = stockprod4l1 + addstock;
                                            System.out.println("Produto: " + nomeprod4 + " (" + codprod4l2 + ")");
                                            System.out.println("Stock em loja 1: " + stockprod4l1);
                                            System.out.println("Stock em loja 2: " + stockprod4l2);

                                        } else {

                                            System.out.println("Não tem suficiente!");
                                        }
                                    }
                                }
                                break;

                            case 5:

                                totall2 = (precoprod1 * stockprod1l2) + (precoprod2 * stockprod2l2) + (precoprod3 * stockprod3l2) + (precoprod4 * stockprod4l2);
                                System.out.println("----------------------------");
                                System.out.println("Valor total em loja: " + totall2 + " €");
                                break;

                            case 6:

                                totall1 = (precoprod1 * stockprod1l1) + (precoprod2 * stockprod2l1) + (precoprod3 * stockprod3l1) + (precoprod4 * stockprod4l1);
                                totall2 = (precoprod1 * stockprod1l2) + (precoprod2 * stockprod2l2) + (precoprod3 * stockprod3l2) + (precoprod4 * stockprod4l2);
                                System.out.println("----------------------------");
                                System.out.println("Valor total nas 2 lojas: " + (totall1 + totall2) + " €");
                                break;

                            case 7:

                                totall1 = (precoprod1 * stockprod1l1) + (precoprod2 * stockprod2l1) + (precoprod3 * stockprod3l1) + (precoprod4 * stockprod4l1);
                                totall2 = (precoprod1 * stockprod1l2) + (precoprod2 * stockprod2l2) + (precoprod3 * stockprod3l2) + (precoprod4 * stockprod4l2);

                                if (totall1 < totall2) {

                                    System.out.println("----------------------------");
                                    System.out.println("A loja com maior valor é a loja 2 com: " + totall2 + " €");
                                }

                                if (totall2 < totall1) {

                                    System.out.println("----------------------------");
                                    System.out.println("A loja com maior valor é a loja 1 com: " + totall1 + " €");
                                }

                                if (totall1 == totall2) {

                                    System.out.println("----------------------------");
                                    System.out.println("Ambas as lojas têm o mesmo valor");
                                }
                                break;

                            case 8:

                                login = -1;
                                break;

                            default:

                                System.out.println("Selecione uma opção válida.");
                                break;


                        }

                    } while (login > 0);
                }
            } while (login > 0);
        } while (loginon);
    }
}